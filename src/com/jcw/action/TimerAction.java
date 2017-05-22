package com.jcw.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by jiangchangwei on 2017/5/21.
 */
public class TimerAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        for(int  i = 0; i < 10000; i++) {
            System.out.println("i love you");
        }
        return SUCCESS;
    }
}
