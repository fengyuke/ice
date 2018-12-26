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

public final class HelloServicePrxHolder
{
    public
    HelloServicePrxHolder()
    {
    }

    public
    HelloServicePrxHolder(HelloServicePrx value)
    {
        this.value = value;
    }

    public HelloServicePrx value;
}
