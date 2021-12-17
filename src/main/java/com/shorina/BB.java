package com.shorina;

public class BB implements Technology, Check {
    @Override
    public void sendQuestion(){
        System.out.println("Send your question om teacher's Email.");
    }
    @Override
    public void getAnswer(){
        System.out.println("Try find your question on page 'Frequently questions' ");
    }
    @Override
    public void passCheck(){
        System.out.println("Answer to the question on this form:");
    }
}
