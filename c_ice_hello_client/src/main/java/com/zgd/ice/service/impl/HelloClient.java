package com.zgd.ice.service.impl;

import java.util.logging.Logger;

import com.zgd.ice.service.HelloServicePrx;
import com.zgd.ice.service.HelloServicePrxHelper;

import Ice.Communicator;
import Ice.ObjectPrx;
import Ice.Util;

/**
 * ICE客户端
 * @author zhuxy
 *
 */
public class HelloClient {
     private static Logger log = Logger.getLogger(HelloClient.class.getSimpleName());
     
     public static void main(String[] args) {
		//创建一个通信器
    	 Communicator ic = null;
    	 //初始化通信器
    	 ic = Util.initialize(args);
    	//创建代理
    	//格式：AppGateway:default -h XXX.XXX.XXX.XXX -p 10000
         ObjectPrx prx = ic.stringToProxy("HelloIce:default -p 1888");
        //转换成HelloService类型的代理服务
         HelloServicePrx checkedCast = HelloServicePrxHelper.checkedCast(prx);
    	//调用服务
         String sayHello = checkedCast.sayHello("测试通信。。。");
         
         System.out.println("远程调用成功 结果是"+sayHello);
	}
}
