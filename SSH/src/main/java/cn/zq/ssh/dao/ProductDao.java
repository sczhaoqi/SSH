package cn.zq.ssh.dao;

import cn.zq.ssh.model.Product;

import java.util.List;

/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {

    void saveProduct(Product product);

    List listProduct();
}