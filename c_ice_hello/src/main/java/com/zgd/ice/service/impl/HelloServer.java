package com.zgd.ice.service.impl;

import java.util.logging.Logger;

import Ice.Communicator;
import Ice.Identity;
import Ice.ObjectAdapter;
import Ice.Util;

/**
 * 服务启动器
 * @author zhuxy
 *
 */
public class HelloServer {
    private static Logger log = Logger.getLogger(HelloServer.class.getSimpleName());
    
    public static void main(String[] args) {
    	//创建一个通信器
    	Communicator  ic = null;
    	//初始化通信器
    	ic = Util.initialize(args);
    	// 创建ice适配器,将服务调用地址和服务映射起来
        // "HelloServiceAdapter"是适配器名, "default -p 1888"是服务调用的地址
    	//格式：AppGateway:default -h XXX.XXX.XXX.XXX -p 10000
    	ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("HelloServiceAdapter", "default -p 1888");
    	// 将服务的具体实现类servant交给这个适配器
    	HelloI servant = new HelloI();
    	// "HelloIce"--服务接口在ice中注册名,转成唯一标识identity
    	Identity id = Util.stringToIdentity("HelloIce");
    	//将服务与唯一标识绑定关系交给适配器
    	adapter.add(servant, id);
    	//激活适配器
    	adapter.activate();
    	
    	log.info("服务端服务启动成功。。。。。");
    	
    	
    	
    	
	}
    
}
