package com.yxb.cms.dao;

import com.yxb.cms.domain.vo.Product;

import java.util.List;

/**
 * @ Title : 产品管理
 * @ Description :
 * @ author : yxq(yixin)
 * @ version : 1.0
 * @ DateTime : 2017/11/17 14:40
 */
public interface ProductMapper {
    List<Product> getProductAll();
}
