// **********************************************************************
//
// Copyright (c) 2003-2007 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.2.0

package com.zgd.ice.service;

public interface HelloServicePrx extends Ice.ObjectPrx
{
    public String sayHello(String s);
    public String sayHello(String s, java.util.Map<String, String> __ctx);
}
