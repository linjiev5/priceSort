/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdbc.DataConnection;
import object.Data;

/**
 *
 * @author user
 */
public class History extends javax.swing.JFrame {

    /**
     * Creates new form Ｈｉｓｔｏｒｙ
     */
    public History() {
        initComponents();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        showHistory = new javax.swing.JTable();
        sortCheap = new javax.swing.JButton();
        sortExpensive = new javax.swing.JButton();
        csvOutput = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        showMessage = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        updateTime = new javax.swing.JLabel();
        createTime = new javax.swing.JLabel();
        showTitle = new javax.swing.JLabel();
        showPrice = new javax.swing.JLabel();
        showImg = new javax.swing.JLabel();
        showCreateTime = new javax.swing.JLabel();
        showUpdateTime = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        showId = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "サイト", "商品名", "価格", "img", "作成時間", "更新時間"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showHistory);

        sortCheap.setText("安い順");
        sortCheap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortCheapActionPerformed(evt);
            }
        });

        sortExpensive.setText("高い順");
        sortExpensive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortExpensiveActionPerformed(evt);
            }
        });

        csvOutput.setText("ｃｓｖ出力");
        csvOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvOutputActionPerformed(evt);
            }
        });

        deleteData.setText("データ削除");
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        id.setText("id");

        price.setText("価格");

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setText("img");

        updateTime.setText("更新時間");

        createTime.setText("作成時間");

        title.setText("商品名");

        close.setText("閉じる");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(deleteData))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(showTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(showPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(updateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(showUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(createTime, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(showCreateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(showImg, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(close)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(showId, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(sortCheap)
                        .addGap(18, 18, 18)
                        .addComponent(sortExpensive)
                        .addGap(57, 57, 57)
                        .addComponent(csvOutput)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(647, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(304, 304, 304)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(showMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(csvOutput)
                        .addComponent(close))
                    .addComponent(sortCheap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(sortExpensive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(showPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(showImg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(showCreateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(createTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(updateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(showUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * 安い順でデータを表示する
     *
     * @param evt
     */
    private void sortCheapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortCheapActionPerformed
        // TODO add your handling code here:
        ShowData sd = new ShowData();
        String query = null;
        String key = sd.getkey();
        DataConnection dc = new DataConnection();
        DefaultTableModel model = (DefaultTableModel) showHistory.getModel();
        if (key.equals("")) {
            model.setRowCount(0);
            query = "select*from yahooSearchResult  order by price;";
            showMessage.setText("安い順です");
        } else {
            model.setRowCount(0);
            query = "select*from yahooSearchResult where keys ='" + key + "' order by price;";
            showMessage.setText(key + " の安い順です");
        }
        ArrayList<Data> d = dc.getData(query);
        if (d.isEmpty()) {
            showMessage.setText(key + "のデータはありません");
        } else {
            showDataToModel(d);
        }


    }//GEN-LAST:event_sortCheapActionPerformed
    /**
     * データをｃｓｖで出力する
     *
     * @param evt
     */
    private void csvOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvOutputActionPerformed
        // TODO add your handling code here:
        JFileChooser jc = new JFileChooser();
        jc.showSaveDialog(null);
        File f = jc.getSelectedFile();
        DefaultTableModel model = (DefaultTableModel) showHistory.getModel();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String date = simpleDateFormat.format(new Date());
        try {
            Object data[] = model.getDataVector().toArray();
            if (!f.exists()) {
                FileWriter fw = new FileWriter(f, false);
                // タイトルを設定する
                String title = model.getColumnName(0) + "," + model.getColumnName(1) + "," + model.getColumnName(2) + "," + model.getColumnName(3) + "," + model.getColumnName(4) + "," + model.getColumnName(5) + "," + model.getColumnName(6) + "," + model.getColumnName(7) + "," + date + "\n";
                // タイトルを書き込み
                fw.write(title);
                //　ループしてデータを挿入
                for (Object data1 : data) {
                    String line = data1.toString();
                    line = line.substring(1, line.length() - 1) + "\n";
                    System.out.println(line);
                    fw.write(line);
                }
                fw.close();
                showMessage.setText("データを出力しました");

            } else {
                // 同じ名前のデータがこの場所にある場合に上書きを提示する
                int r = JOptionPane.showConfirmDialog(this, "同じ名前のデータがありますが，上書きしますか", "確認", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                //　yesを選択する場合，上書きする
                if (r == JOptionPane.YES_OPTION) {
                    FileWriter fw = new FileWriter(f, false);
                    String title = model.getColumnName(0) + "," + model.getColumnName(1) + "," + model.getColumnName(2) + "," + model.getColumnName(3) + "," + model.getColumnName(4) + "," + model.getColumnName(5) + "," + model.getColumnName(6) + "," + model.getColumnName(7) + "," + date + "\n";
                    fw.write(title);
                    for (Object data1 : data) {
                        String line = data1.toString();
                        line = line.substring(1, line.length() - 1) + "\n";
                        System.out.println(line);
                        fw.write(line);
                    }
                    fw.close();
                    showMessage.setText("データを出力しました");
                    // キャンセルする場合，提示するだけ
                } else {
                    showMessage.setText("キャンセルしました");

                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_csvOutputActionPerformed
/**
 * 　選んだデータを削除する
 * @param evt 
 */
    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) showHistory.getModel();
        if (showHistory.getSelectedRows().length >= 1) {
            DataConnection dc = new DataConnection();
            int r = JOptionPane.showConfirmDialog(this, "削除したら戻せないです", "確認", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (r == JOptionPane.YES_OPTION) {
                int rows[] = showHistory.getSelectedRows();
                for (int x = 0; x < rows.length; x++) {
                    Object id = model.getValueAt(rows[x], 0);
                    String query = "delete from yahooSearchResult where id ='" + id + "'";
                    dc.excuteSQLQuery(query);
                }
                model.setRowCount(0);
                showData();
                int count = rows.length;
                String message = count + "件のデータが削除しました";
                showMessage.setText(message);
            } else {

            }
        } else {
            showMessage.setText("削除するデータを選択してください");
        }


    }//GEN-LAST:event_deleteDataActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed
/**
 * 安い順で表示する
 * @param evt 
 */
    private void sortExpensiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortExpensiveActionPerformed
        // TODO add your handling code here:
        ShowData sd = new ShowData();
        String query = null;
        String key = sd.getkey();
        DataConnection dc = new DataConnection();
        DefaultTableModel model = (DefaultTableModel) showHistory.getModel();
        if (key.equals("")) {
            model.setRowCount(0);
            query = "select*from yahooSearchResult  order by price desc;";
            showMessage.setText("安い順です");
        } else {
            model.setRowCount(0);
            query = "select*from yahooSearchResult where keys ='" + key + "' order by price desc;";
            showMessage.setText(key + " の安い順です");
        }
        ArrayList<Data> d = dc.getData(query);
        if (d.isEmpty()) {
            showMessage.setText(key + "のデータはありません");
        } else {
            showDataToModel(d);
        }

    }//GEN-LAST:event_sortExpensiveActionPerformed
/**
 * 一行の内容を右側に表示する
 * @param evt 
 */
    private void showHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showHistoryMouseClicked
        // TODO add your handling code here:
        // 選択された行をiに表示する
        int i = showHistory.getSelectedRow();
        TableModel model = showHistory.getModel();
        //　該当する欄に表示する
        showId.setText(model.getValueAt(i, 0).toString());
        showTitle.setText(model.getValueAt(i, 2).toString());
        showPrice.setText(model.getValueAt(i, 3).toString());
        showImg.setText(model.getValueAt(i, 4).toString());
        showCreateTime.setText(model.getValueAt(i, 5).toString());
        showUpdateTime.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_showHistoryMouseClicked
    public void showDataToModel(ArrayList<Data> data) {
        if (!data.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) showHistory.getModel();
            Object[] row = new Object[7];
            //数列でデータをテーブルに入れる
            for (int i = 0; i < data.size(); i++) {
                row[0] = data.get(i).getId();

                row[1] = "yahooショッピング";

                row[4] = data.get(i).getImg();
                row[2] = data.get(i).getTitle();
                row[3] = data.get(i).getPrice();
                row[5] = data.get(i).getCreateTime();
                row[6] = data.get(i).getUpdateTime();
                // 数列でテーブルに入れる
                model.addRow(row);
            }
        } else {
            showMessage.setText("該当するデータはありません");
            JOptionPane.showMessageDialog(this, "データはありません");
        }
    }

    /**
     * すべてのデータをテーブルに写す
     */
    public void showData() {
        DefaultTableModel model = (DefaultTableModel) showHistory.getModel();
        model.setRowCount(0);
        // listでデータを取得する
        DataConnection bc = new DataConnection();
        String query = "select * from yahooSearchResult;";
        ArrayList<Data> list = bc.getData(query);
        if (!list.isEmpty()) {
            showDataToModel(list);
        } else {

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(History.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel createTime;
    private javax.swing.JButton csvOutput;
    private javax.swing.JButton deleteData;
    private javax.swing.JLabel id;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel showCreateTime;
    private javax.swing.JTable showHistory;
    private javax.swing.JLabel showId;
    private javax.swing.JLabel showImg;
    private javax.swing.JLabel showMessage;
    private javax.swing.JLabel showPrice;
    private javax.swing.JLabel showTitle;
    private javax.swing.JLabel showUpdateTime;
    private javax.swing.JButton sortCheap;
    private javax.swing.JButton sortExpensive;
    private javax.swing.JLabel title;
    private javax.swing.JLabel updateTime;
    // End of variables declaration//GEN-END:variables
}
