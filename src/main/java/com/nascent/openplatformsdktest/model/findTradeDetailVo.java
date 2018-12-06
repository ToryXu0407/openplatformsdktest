package com.nascent.openplatformsdktest.model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/12/4
 * Time:14:18
 */
@Repository
public class findTradeDetailVo {

    /**
     *外部订单编号
     */
    private Long outTradeId;

    /**
     *groupId
     */
    private Long groupId;


    /**
     *订单来源
     */
    private Long platform;


    /**
     *brandId
     */
    private Long brandId;

    @Bean
    public findTradeDetailVo hello(){
        findTradeDetailVo findTradeDetailVo = new findTradeDetailVo();
        findTradeDetailVo.setPlatform(1L);
        return findTradeDetailVo;
    }
    public Long getOutTradeId() {
        return outTradeId;
    }

    public void setOutTradeId(Long outTradeId) {
        this.outTradeId = outTradeId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getPlatform() {
        return platform;
    }

    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
