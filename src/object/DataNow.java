package object;

import java.sql.Timestamp;

/**
 *
 * @author user
 */
public class DataNow {

    private int id;
    private String keys;

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
    private String img;
    private String title;
    private int price;

    private Timestamp createTime;

    public Timestamp setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return createTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
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
