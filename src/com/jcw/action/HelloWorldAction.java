package com.jcw.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

/**
 * Created by jiangchangwei on 2017/5/21.
 */
public class HelloWorldAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware {

    @Override
    public String execute() throws Exception {
        System.out.println("执行Action");
        return SUCCESS;
    }

    public String add(){
        System.out.println("执行add");
        return "add";
    }

    public String update(){
        System.out.println("执行update");
        return "update";
    }

    public void setServletRequest(javax.servlet.http.HttpServletRequest request) {

    }

    public void setServletResponse(javax.servlet.http.HttpServletResponse response) {

    }

    public void setServletContext(javax.servlet.ServletContext context) {

    }
}
