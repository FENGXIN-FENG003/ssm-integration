package com.fengxin.utils;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description 返回结果类
 **/

public class R {
    //200成功状态码
    private int code = 200;
    //返回状态
    private boolean flag = true;
    //返回具体数据
    private Object data;
    
    
    public  static R ok(Object data){
        R r = new R();
        r.data = data;
        return r;
    }
    
    public static R  fail(Object data){
        R r = new R();
        //错误码
        r.code = 500;
        //错误状态
        r.flag = false;
        r.data = data;
        return r;
    }
    
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public boolean isFlag() {
        return flag;
    }
    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
}
