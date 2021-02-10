/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import object.Data;
import object.DataNow;

/**
 *
 * @author user
 */
public class DataConnection {

    String url = "jdbc:postgresql://localHost:5432/lin";
    String user = "postgres";
    String pas = "postgres";

    /**
     * データベースに連結する
     *
     * @return
     */
    public java.sql.Connection getConnection() {
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection(url, user, pas);
            return con;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * データを取得する
     *
     * @param query
     * @return
     */
    public ArrayList<DataNow> getDataNow(String query) {
        // 本のデータをListで保存する
        ArrayList<DataNow> data = new ArrayList<>();
        java.sql.Connection connection = getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            // sqlを入れて検索する
            rs = st.executeQuery(query);
            // データをループする

            while (rs.next()) {
                // データをdで保存する
                DataNow d = new DataNow();
                d.setId(rs.getInt("id"));
                d.setKeys(rs.getString("keys"));
                d.setImg(rs.getString("img"));
                d.setTitle(rs.getString("title"));
                d.setPrice(rs.getInt("price"));
                d.setCreateTime(rs.getTimestamp("createTime"));
                // Listに入れる
                data.add(d);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return data;
    }
    /**
     * 更新したデータのlistを取得する
     *
     * @param query
     * @return
     */
    public ArrayList<Data> getData(String query) {
        // データをListで保存する
        ArrayList<Data> data = new ArrayList<>();
        java.sql.Connection connection = getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            // sqlを入れて検索する
            rs = st.executeQuery(query);
            // データをループする

            while (rs.next()) {
                // データをdで保存する
                Data d = new Data();
                d.setId(rs.getInt("id"));
                d.setKeys(rs.getString("keys"));
                d.setImg(rs.getString("img"));
                d.setTitle(rs.getString("title"));
                d.setPrice(rs.getInt("price"));
                d.setCreateTime(rs.getTimestamp("createTime"));
                d.setUpdataTime(rs.getTimestamp("updatetime"));
                // Listに入れる
                data.add(d);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return data;
    }

    /**
     * queryでデータを増やし、削除、更新する
     *
     * @param query
     * @return i
     */
    public int excuteSQLQuery(String query) {
        int i = 0;
        java.sql.Connection con = getConnection();
        Statement st;
        try {
            st = con.createStatement();
            // 入れたsqlを実行する
            System.out.println(query);
            i = st.executeUpdate(query);
            con.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * データベースに同じデータがあるか
     *
     * @param query
     * @return
     */
    public int getSameData(String query) {
        int i = 0;
        java.sql.Connection con = getConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            // sqlqueryで検索する
            ResultSet rs = stmt.executeQuery(query);
            // データが存在する場合

            if (rs != null && rs.next()) {
                i = 1;
            } else {
                // データがなければiは0のまま戻る
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(i);
        return i;
    }
    
}
