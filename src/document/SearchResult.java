package document;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import object.Data;

/**
 * Hello world!
 *
 */
public class SearchResult {

    /**
     * 検索したデータをArrayListに戻る
     *
     * @param url
     * @return
     * @throws IOException
     */
    public ArrayList<Data> searchYahoo(String url) throws IOException {

        // 30秒に反応しない時にエラーにする
        Document document = Jsoup.parse(new URL(url), 30000);
        //	idで検索した結果を取る
        Element element = document.getElementById("searchResults");
        // liタグの内容をすべて取る
        Elements elements = element.getElementsByTag("li");

        // データをlistに保存するを作成
        ArrayList<Data> datas = new ArrayList<>();

        // データをループする
        elements.forEach((el) -> {
            String img = el.getElementsByTag("img").eq(0).attr("src");
            String title = el.getElementsByClass("WeRPqEQO_DMj _1VKjxTPHoUiu").eq(0).text();
            String prices = el.getElementsByClass("_1_rYNy1GQ5n- _3Z3ly613XmPi").eq(0).text();
            if (img.isEmpty() && title.isEmpty() && prices.isEmpty()) {

            } else {
                // カンマを削除
                prices = prices.substring(0, prices.length() - 1).replace(",", "");
                // intに切り替える
                int price = Integer.parseInt(prices);
                // objectクラスでdataを設定す
                Data data = new Data();
                data.setImg(img);
                data.setPrice(price);
                title = title.replace("'", "’");
                data.setTitle(title);
                // データをlistに保存する
                datas.add(data);
                //				System.out.println(img);
                //				System.out.println(title);
                //				System.out.println(price);
                //				System.out.println("============================");
            }
        });

        return datas;

    }

}
