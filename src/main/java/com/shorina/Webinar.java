package com.shorina;

public class Webinar implements Technology{
    @Override
    public void sendQuestion(){
        System.out.println("Ask question in chat");
    }
    @Override
    public void getAnswer(){
        System.out.println("Listen verbal answer");
    }
}
