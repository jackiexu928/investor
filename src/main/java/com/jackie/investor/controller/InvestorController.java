package com.jackie.investor.controller;

import com.alibaba.fastjson.JSON;
import com.jackie.investor.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/16
 */
@RestController
@RequestMapping("investor")
public class InvestorController {
    @Autowired
    private InvestorService investorService;

    @GetMapping("getAllInvestor")
    @ResponseBody
    public String getAllInvestor(){
        return JSON.toJSONString(investorService.getInvestorHoldAll());
    }
}
