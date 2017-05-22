package com.jcw.action;

import com.jcw.po.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

/**
 * Created by jiangchangwei on 2017/5/21.
 */
public class LoginAction extends ActionSupport implements SessionAware {
   private String username;
   private String password;
   private Map<String, Object> session;
    public String login() {
        if("admin".equals(username) && "admin".equals(password)) {
            session.put("loginInfo", username);
            return SUCCESS;
        }else {
            session.put("loginError", "用户名或密码不正确");
            return ERROR;
        }
    }


    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
