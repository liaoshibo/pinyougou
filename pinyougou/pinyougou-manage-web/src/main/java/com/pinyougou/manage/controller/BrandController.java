package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Date:2018/12/11
 * Author: pasca,the best man in the fucture
 * Desc:
 */
@RequestMapping("/brand")
//@Controller
@RestController
public class BrandController {

    @Reference
    private BrandService brandService;
    /*@RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody*/
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }
}
