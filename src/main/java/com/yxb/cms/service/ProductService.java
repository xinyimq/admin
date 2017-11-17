package com.yxb.cms.service;

import com.yxb.cms.dao.ProductMapper;
import com.yxb.cms.domain.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Title : 产品管理Serivce
 * @ Description :
 * @ author : yxq(yixin)
 * @ version : 1.0
 * @ DateTime : 2017/11/17 14:39
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    /**
     * 产品列表
     * @return List
     */
    public List<Product> selectRoleList(){
        List<Product> productList = productMapper.getProductAll();
        return productList;
    }
}
