package com.shorina;

public class GoogleClass implements Technology {
    @Override
    public void sendQuestion(){
        System.out.println("Ask question in google document");
    }
    @Override
    public void getAnswer(){
        System.out.println("Reed answer in google document");
    }
}
