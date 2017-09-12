package cn.zq.ssh.service.impl;


import cn.zq.ssh.dao.ProductDao;
import cn.zq.ssh.model.Product;
import cn.zq.ssh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void saveProduct(Product product) {

        productDao.saveProduct(product);

    }

    @Override
    public List listProduct() {
        return productDao.listProduct();
    }

}
