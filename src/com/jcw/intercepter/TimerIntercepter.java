package com.jcw.intercepter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by jiangchangwei on 2017/5/21.
 */
public class TimerIntercepter extends AbstractInterceptor {
    public String intercept(ActionInvocation invocation) throws Exception {
        //执行action之前
        long start = System.currentTimeMillis();
        //执行下一个拦截器，如果已经是最后一个拦截器，则执行目标action
        String result = invocation.invoke();
        //执行action之后，再次统计时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end-start) + "ms");
        return result;

    }
}
