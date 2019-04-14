package com.gaojingsi.springbootwebsocketdemo.domain;

import java.util.Date;

public class ChatMessage {

    /***
     * 消息类型
     */
    private String type;

    /***
     * 消息发送人
     */
    private String sender;

    /***
     * 接收人
     */
    private String receiver;

    /***
     * 消息内容
     */
    private String msg;

    /***
     * 消息发生时间时间
     */
    private Date time;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}