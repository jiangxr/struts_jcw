package com.jcw.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by jiangchangwei on 2017/5/21.
 */
public class AuthIntercepter extends AbstractInterceptor {
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext context = ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        if(session.get("loginInfo") != null) {
            return invocation.invoke();
        }else {
            return "login";
        }
    }
}
