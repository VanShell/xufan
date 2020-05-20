package com.beauty.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.beauty.api.vo.ResultInfoVo;
import com.beauty.consumer.service.RPCInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {
    @Autowired
    private RPCInterface rpcInterface;

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome(){
        System.out.println("welcome to consumer");
        ResultInfoVo resultInfoVo = rpcInterface.getResult();
        System.out.println("resultInfo==="+ JSON.toJSONString(resultInfoVo));
        return "welcome to consumer";
    }
}
