package com.jackie.investor;

import com.jackie.investor.mapper.InvestorMapper;
import com.jackie.stockbean.investor.dto.response.InvestorHoldRespDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class InvestorApplicationTests {
    @Autowired
    private InvestorMapper investorMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test1(){
        List<InvestorHoldRespDTO> hold = investorMapper.findHold();
        System.out.printf("adsf");
    }
}
