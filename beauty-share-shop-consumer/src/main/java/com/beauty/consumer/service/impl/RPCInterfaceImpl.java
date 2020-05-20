package com.beauty.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beauty.api.service.IAPIService;
import com.beauty.api.vo.ResultInfoVo;
import com.beauty.consumer.service.RPCInterface;
import org.springframework.stereotype.Service;

@Service
public class RPCInterfaceImpl implements RPCInterface {
    @Reference(version = "1.0.0")
    private IAPIService rpcInterface;

    @Override
    public ResultInfoVo getResult() {
        System.out.println("进入接口，进行RPC请求了");
        return rpcInterface.getResultInfo("123") ;
    }
}
