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

public final class _HelloServiceDelD extends Ice._ObjectDelD implements _HelloServiceDel
{
    public String
    sayHello(String s, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper
    {
        Ice.Current __current = new Ice.Current();
        __initCurrent(__current, "sayHello", Ice.OperationMode.Normal, __ctx);
        while(true)
        {
            IceInternal.Direct __direct = new IceInternal.Direct(__current);
            try
            {
                HelloService __servant = null;
                try
                {
                    __servant = (HelloService)__direct.servant();
                }
                catch(ClassCastException __ex)
                {
                    Ice.OperationNotExistException __opEx = new Ice.OperationNotExistException();
                    __opEx.id = __current.id;
                    __opEx.facet = __current.facet;
                    __opEx.operation = __current.operation;
                    throw __opEx;
                }
                try
                {
                    return __servant.sayHello(s, __current);
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
            finally
            {
                __direct.destroy();
            }
        }
    }
}
