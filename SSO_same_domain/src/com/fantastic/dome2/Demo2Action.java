package com.fantastic.dome2;

/**
 * Created by wuzhuo on 17/5/23.
 */
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.fantastic.util.SSOCheck;

public class Demo2Action extends ActionSupport{
    private String gotourl;
    public String main(){
        HttpServletRequest request = ServletActionContext.getRequest();
        boolean ok = SSOCheck.checkcookie(request);
        if(ok){
            return SUCCESS;
        }
        gotourl = "/demo2/main.action";
        return "login";
    }
    public String getGotourl() {
        return gotourl;
    }
    public void setGotourl(String gotourl) {
        this.gotourl = gotourl;
    }
}
