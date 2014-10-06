package com.ajay.demo.entry;

import com.ajay.demo.authentication.UserNamePasswordAuthentication;

/**
 * Created by ajay on 6/10/14.
 */
public class App {

    public static void main( String[] args ) {

        System.out.println("----------- Swing Poc is running ------------");
        UserNamePasswordAuthentication userNamePasswordAuthentication = new UserNamePasswordAuthentication();
        userNamePasswordAuthentication.showSignInView();
    }

}
