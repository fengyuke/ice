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

public final class HelloServicePrxHelper extends Ice.ObjectPrxHelperBase implements HelloServicePrx
{
    public String
    sayHello(String s)
    {
        return sayHello(s, null, false);
    }

    public String
    sayHello(String s, java.util.Map<String, String> __ctx)
    {
        return sayHello(s, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    sayHello(String s, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("sayHello");
                __delBase = __getDelegate();
                _HelloServiceDel __del = (_HelloServiceDel)__delBase;
                return __del.sayHello(s, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, __cnt);
            }
        }
    }

    public static HelloServicePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        HelloServicePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (HelloServicePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::service::HelloService"))
                {
                    HelloServicePrxHelper __h = new HelloServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static HelloServicePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        HelloServicePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (HelloServicePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::service::HelloService", __ctx))
                {
                    HelloServicePrxHelper __h = new HelloServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static HelloServicePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        HelloServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::service::HelloService"))
                {
                    HelloServicePrxHelper __h = new HelloServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static HelloServicePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        HelloServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::service::HelloService", __ctx))
                {
                    HelloServicePrxHelper __h = new HelloServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static HelloServicePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        HelloServicePrx __d = null;
        if(__obj != null)
        {
            HelloServicePrxHelper __h = new HelloServicePrxHelper();
            __h.__copyFrom(__obj);
            __d = __h;
        }
        return __d;
    }

    public static HelloServicePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        HelloServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            HelloServicePrxHelper __h = new HelloServicePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _HelloServiceDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _HelloServiceDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, HelloServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static HelloServicePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            HelloServicePrxHelper result = new HelloServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
