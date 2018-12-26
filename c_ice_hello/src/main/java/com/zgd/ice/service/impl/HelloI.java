package com.zgd.ice.service.impl;

import java.util.logging.Logger;

import com.zgd.ice.service._HelloServiceDisp;

import Ice.Current;

public class HelloI extends _HelloServiceDisp{
	
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());
    
	public String sayHello(String s, Current __current) {
		 log.info("具体的服务接口实现类中的sayHello方法被调用了。。。");

		return "sayHello  "+s;
	}

}
