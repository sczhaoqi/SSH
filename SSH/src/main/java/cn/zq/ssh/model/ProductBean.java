package cn.zq.ssh.model;

/**
 * Created by AIERXUAN on 2017/9/12.
 */
public class ProductBean {
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int pid;// 商品ID
    private String pname;// 商品名称
    private double price;// 商品价格
}
