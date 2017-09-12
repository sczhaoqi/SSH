package cn.zq.ssh.dao.impl;

import cn.zq.ssh.dao.ProductDao;
import cn.zq.ssh.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品信息-服务层实现
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    private HibernateTemplate template;
    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {

        this.template = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void saveProduct(Product product) {

        template.save(product);

    }

    @Override
    public List listProduct() {
        return template.find("from Product");
    }

}