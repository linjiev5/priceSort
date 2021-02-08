/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.org.apache.xml.internal.utils.URI;
import document.SearchResult;
import java.io.IOException;
import java.net.MalformedURLException;
import jdbc.DataConnection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SearchResultTest {

    public SearchResultTest() {
    }

    @Test
    public void testSearchResult() throws IOException {
        SearchResult sr = new SearchResult();
        String url = "https://shopping.yahoo.co.jp/search?&p=%E3%81%94%E3%81%BF%E7%AE%B1";
        assertNotNull(sr.searchYahoo(url));
    }

    @Test(expected = NullPointerException.class)
    public void testSearchResult_1() throws IOException {
        SearchResult sr = new SearchResult();
        String url = "https://shopping.yahoo.co.jp/search";
        sr.searchYahoo(url);
    }

    @Test(expected = MalformedURLException.class)
    public void testSearchResult_2() throws IOException {
        SearchResult sr = new SearchResult();
        String url = null;
        sr.searchYahoo(url);
    }

    @Test
    public void testExcuteSQLQuery() {
        DataConnection c = new DataConnection();
        String query = "insert \r\n"
                + "into yahooSearchResultNow(id,keys,img, title, price,createTime) \r\n"
                + "values (nextval('yahooSearchResultNow_id_seq'),'keys','ww', 'qq', 1000,'1999-01-08 04:05:06');";
        assertEquals(1, c.excuteSQLQuery(query));

    }

    @Test
    public void testGetSameData() {
        DataConnection c = new DataConnection();
        String query = "select * from yahooSearchResultNow where keys = 'keys';";
        assertEquals(1, c.getSameData(query));
    }
    @Test
    public void testExcuteSQLQuery_1() {
        DataConnection c = new DataConnection();
        String query = "delete from yahooSearchResultNow where keys = 'keys';";
        assertEquals(1, c.excuteSQLQuery(query));

    }
}
