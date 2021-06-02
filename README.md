# priceSort
「価格ソート」

「価格ソート」はNetBeans、Jsoupを利用して，ECサイトのデータをスクレイピングするアプリです。サイトでキーワード検索したデータを取得（５ページ）、表示、ソート、キーワード検索、削除します。

開発期間は約2ヶ月です。

# 1．開発環境

1-1　IDE:NetBeans 8.2バージョン

1-2　OS:Windows7

1-3　データベース:PostgreSQL

1-4　ソース管理:Githubを利用

1-5　テスト:Junit

1-6　その他:ソースコードはUTF-8で作成する。

CSVファイルはSHIFT_JISで作成する。（excelからCSV形式で保存したときの標準）

# 2．画面

画面遷移図と画面は以下となります：

#### 2-1．画面遷移図

<img src="img/image-20210421145505973.png" alt="image-20210421145505973" style="zoom:100%;" />

#### 2-2．データ一覧表示画面
<img src="img/image-20210421151114248.png"  style="zoom:100%;" />
画面レイアウト：
<img src="img/image-20210421145659594.png"  style="zoom:100%;" />
<img src="img/image-20210421150350059.png"  style="zoom:100%;" />
<img src="img/image-20210421150525342.png"  style="zoom:100%;" />

#### 2-3．履歴一覧表示
<img src="img/image-20210421151005941.png"  style="zoom:100%;" />

画面レイアウト：
<img src="img/image-20210421151248873.png"  style="zoom:100%;" />
<img src="img/image-20210421151319957.png"  style="zoom:100%;" />
<img src="img/image-20210421151350760.png"  style="zoom:100%;" />

#### 2-4．データ取得
<img src="img/image-20210421151634543.png"  style="zoom:100%;" />

画面レイアウト：
<img src="img/image-20210421151654889.png"  style="zoom:100%;" />
<img src="img/image-20210421151707930.png"  style="zoom:100%;" />
<img src="img/image-20210421151731935.png"  style="zoom:100%;" />



# 3．構成

プロジェクト構成は下記の通りです。
<img src="img/image-20210421153747851.png"  style="zoom:100%;" />
<img src="img/image-20210421153915379.png"  style="zoom:100%;" />
<img src="img/image-20210421154543020.png"  style="zoom:100%;" />

# 4．実践

「栗」を検索してみます：
<img src="img/image-20210421155248566.png"  style="zoom:100%;" />

「商品管理」を押したら
<img src="img/image-20210421155528537.png"  style="zoom:100%;" />

「安い順」を押したら
<img src="img/image-20210421155650024.png"  style="zoom:100%;" />

削除してみます
<img src="img/image-20210421155757076.png"  style="zoom:100%;" />
<img src="img/image-20210421155826723.png"  style="zoom:100%;" />

csvを作成します
<img src="img/image-20210421160030538.png"  style="zoom:100%;" />
