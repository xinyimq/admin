package com.yxb.cms.controller.system;

import com.yxb.cms.controller.BasicController;
import com.yxb.cms.domain.vo.Product;
import com.yxb.cms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ Title : 产品管理控制器
 * @ Description :
 * @ author : yxq(yixin)
 * @ version : 1.0
 * @ DateTime : 2017/11/17 14:38
 */
@Controller
@RequestMapping("product")
public class ProductController extends BasicController{
    @Autowired
    private ProductService productService;

    /**
     *跳转到角色列表页面
     * @return
     */
    @RequestMapping("/taocanlist.do")
    public String toRoleListPage() {
        return "product/taocanlist";
    }
    /**
     * 加载角色列表List
     * @return
     */
    @RequestMapping("/taocanlist.do")
    @ResponseBody
    public List<Product> ajaxRoleList(){
        return productService.selectRoleList();
    }
}
