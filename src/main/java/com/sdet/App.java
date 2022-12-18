package com.sdet;

import java.util.ResourceBundle;

public class App {

public int userLogin(String in_user,String in_pwd){
    ResourceBundle rb=ResourceBundle.getBundle("config");
    String username=rb.getString("username");
    String password=rb.getString("password");

    if(username.equals(in_user) && password.equals(in_pwd)){
        return 1;
    }
    else return -1;
}
}
