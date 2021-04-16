package com.jackie.investor.service;

import com.jackie.investor.mapper.InvestorMapper;
import com.jackie.stockbean.investor.dto.response.InvestorHoldRespDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/16
 */
@Service
public class InvestorService {
    @Autowired
    private InvestorMapper investorMapper;

    public List<InvestorHoldRespDTO> getInvestorHoldAll(){
        List<InvestorHoldRespDTO> list = investorMapper.findHold();
        return list;
    }
}
