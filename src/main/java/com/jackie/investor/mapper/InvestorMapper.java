package com.jackie.investor.mapper;

import com.jackie.stockbean.investor.dto.response.InvestorHoldRespDTO;
import com.jackie.stockbean.investor.entity.Investor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/16
 */
@Mapper
public interface InvestorMapper {
    @Select("select * from investor")
    List<Investor> findAll();

    @Select("select a.id, a.name, a.mobile, a.email, b.hold_fund, b.hold_stock " +
            "from investor a join investor_hold b " +
            "on a.id = b.investor_id")
    List<InvestorHoldRespDTO> findHold();
}
