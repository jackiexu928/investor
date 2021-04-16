package com.jackie.investor.controller;

import com.alibaba.fastjson.JSON;
import com.jackie.investor.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/16
 */
@Controller
@RequestMapping("investor")
public class InvestorController {
    @Autowired
    private InvestorService investorService;

    @GetMapping("getAllInvestor")
    public String getAllInvestor(){
        return JSON.toJSONString(investorService.getInvestorHoldAll());
    }
}
