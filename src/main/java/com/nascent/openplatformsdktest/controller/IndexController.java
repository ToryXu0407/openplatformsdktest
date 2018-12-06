//package com.nascent.openplatformsdktest.controller;
//
//import com.nascent.cloud.pointapi.ApiException;
//import com.nascent.cloud.pointapi.openplatform.DefaultOpenPlatformClient;
//import com.nascent.cloud.pointapi.openplatformdomain.trade.OrdersInfo;
//import com.nascent.cloud.pointapi.openplatformrequest.trade.FindTradeDetailRequest;
//import com.nascent.cloud.pointapi.openplatformrequest.trade.TradeSaveRequest;
//import com.nascent.cloud.pointapi.openplatformresponse.trade.FindTradeDetailResponse;
//import com.nascent.cloud.pointapi.openplatformresponse.trade.TradeSaveResponse;
//import com.nascent.openplatformsdktest.model.findTradeDetailVo;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created with IDEA
// * author:ToryXu
// * Date:2018/12/4
// * Time:14:10
// */
//@Controller
//@RequestMapping("/")
//public class IndexController {
//    @RequestMapping(method = RequestMethod.GET,value = "/index")
//    public String index(){
//        return "index/beforeIndex";
//    }
//    @RequestMapping(method = RequestMethod.POST,value = "/post")
//    public String post(findTradeDetailVo findTradeDetailVo,Model model){
//        FindTradeDetailRequest request = new FindTradeDetailRequest();
//        request.setBrandId(findTradeDetailVo.getBrandId());
//        request.setGroupId(findTradeDetailVo.getGroupId());
//        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
//        request.setAppKey("whd001");
//        request.setServerUrl("http://localhost:9091");
//        //设置其他需要的参数
//        request.setOutTradeId(findTradeDetailVo.getOutTradeId());
//        request.setPlatform(findTradeDetailVo.getPlatform());
//        System.out.println(request.GetParameters());
//        Long start_time = System.currentTimeMillis();
//        System.out.println(start_time);
//        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
//                request.getServerUrl(),request.getAppKey(),request.getAccessToken(),
//                "733d7be2196ff70efaf6913fc8bdcabf",
//                request.getGroupId(),request.getBrandId());
//        FindTradeDetailResponse response = null;
//        try {
//            response = defaultPointClient.execute(request);
//        } catch (ApiException e) {
//            e.printStackTrace();
//        }
//        Long end_time = System.currentTimeMillis();
//        System.out.println(end_time);
//        System.out.println("耗时:"+(end_time-start_time));
//        model.addAttribute("response",response);
//        return "index/index";
//    }
//
//    @RequestMapping(method = RequestMethod.POST,value = "/post2")
//    public String post2(findTradeDetailVo findTradeDetailVo,Model model) throws ApiException {
//
//        TradeSaveRequest request = new TradeSaveRequest();
//        request.setBrandId(100186L);
//        request.setGroupId(120910104359001L);
//        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
//        request.setAppKey("whd001");
//        request.setServerUrl("http://localhost:9091");
//        //设置其他需要的参数
//        request.setOutNick("~ocUyqwTje8QYy29cIHut2ASIBpXA");
//        request.setOutTradeId("1543560995418132");
//        request.setPayType(4);
//        request.setPayment(BigDecimal.valueOf(0));
//        request.setPlatform(19);
//        request.setReceiverAddress("1号街道22号");
//        request.setReceiverCity("北京市");
//        request.setReceiverMobile("13344445555");
//        request.setShopId(1000165L);
//        request.setTitle("榴莲千层");
//        request.setTradeFrom("WAP");
//        request.setTradeStatus("WAIT_BUYER_PAY");
//        request.setBuyerMessage("微甜");
//        request.setCreated("2018-11-30 14:56:35");
//        request.setGroupId(10000020L);
//        request.setIsUseCoupon(0);
//        request.setModifyTime("2018-11-30 14:56:35");
//        List<OrdersInfo> ordersInfos = new ArrayList<>();
//        OrdersInfo order = new OrdersInfo() ;
//        order.setGroupId(10000020L);
//        order.setOrderBuyerRate(false);
//        order.setOrderFrom(String.valueOf(19));
//        order.setOrderIsoversold(false);
//        order.setOrderNum(BigDecimal.valueOf(1.0));
//        order.setOrderPrice(BigDecimal.valueOf(0.01));
//        order.setOrderSellerRate(false);
//        order.setOutItemId("181128170405");
//        order.setOutOrderId("1543560995418132");
//        order.setPicPath("http://ecrp.image.alimmdn.com/ihudong/wxproduct/67787391/201811/735f51b3-735a-43fa-87a3-7f2ebf48bf71.png");
//        order.setShopId("67787391");
//        order.setTitle("榴莲千层");
//        ordersInfos.add(order);
//        request.setOrders(ordersInfos);
//        System.out.println(request.GetParameters());
//        Long start_time = System.currentTimeMillis();
//        System.out.println(start_time);
//        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
//                request.getServerUrl(),request.getAppKey(),request.getAccessToken(),
//                "733d7be2196ff70efaf6913fc8bdcabf",true,
//                request.getGroupId(),request.getBrandId());
//        TradeSaveResponse response = defaultPointClient.execute(request);
//        Long end_time = System.currentTimeMillis();
//        System.out.println(end_time);
//        System.out.println("耗时:"+(end_time-start_time));
//        model.addAttribute("response",response);
//        return "index/index";
//    }
//}
