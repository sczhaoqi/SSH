package cn.zq.ssh.service;


import cn.zq.ssh.model.Product;

import java.util.List;

/**
 * 商品操作-服务层接口
 *
 */
public interface ProductService {

    void saveProduct(Product product);

    List listProduct();
}
