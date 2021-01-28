package object;

import java.sql.Timestamp;

public class Data {

    private int id;
    private String keys;
    private String img;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
    private int price;

    private Timestamp createTime;
    private Timestamp updateTime;

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setUpdataTime(Timestamp updataTime) {
        this.updateTime = updataTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img セットする img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title セットする title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price セットする price
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
