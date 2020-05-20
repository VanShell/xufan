package com.beauty.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.beauty.api.service.IAPIService;
import com.beauty.api.vo.ResultInfoVo;

@Service(version = "1.0.0")
public class ProviderService implements IAPIService {

    @Override
    public ResultInfoVo getResultInfo(String result) {
        System.out.println("已连接上了。。。。");
        ResultInfoVo resultInfoVo = new ResultInfoVo();
        resultInfoVo.setResult("设置了结果..111111111");
        return resultInfoVo;
    }
}
