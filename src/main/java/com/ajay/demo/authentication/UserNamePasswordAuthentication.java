package com.ajay.demo.authentication;

import com.ajay.demo.controller.MainView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This class is used to authenticate the user and password
 *
 */
public class UserNamePasswordAuthentication {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JTextField userName;
    private JPasswordField password;
    private JButton submit;

 public UserNamePasswordAuthentication() {
        prepareUI();
    }
    public void prepareUI() {
        mainFrame = new JFrame("Ajay Soni");
        mainFrame.setSize(650, 250);
        mainFrame.setLayout(new GridLayout(3, 1,1,1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
/*        headerLabel = new JLabel("",JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);*//*

        controlPanel = new JPanel();
       // controlPanel.setLayout(new GridLayout(3,1));

*//*        mainFrame.add(statusLabel);
        mainFrame.add(headerLabel);*//*
*//*        mainFrame.add(controlPanel);*//*
        mainFrame.setVisible(true);*/

    }
    public void showSignInView() {
        headerLabel = new JLabel("",JLabel.CENTER);
        headerLabel.setText("---Welcome--");
        headerLabel.setBackground(Color.BLUE);
        headerLabel.setForeground(Color.CYAN);
        mainFrame.add(headerLabel);

        controlPanel = new JPanel(new BoxLayout(mainFrame.getContentPane(),BoxLayout.Y_AXIS));

        final JLabel userNameLabel = new JLabel("UserName",JLabel.RIGHT);
        JLabel passwordLabel = new JLabel("Password",JLabel.CENTER);

        controlPanel = new JPanel();
        userName = new JTextField(8);
        password = new JPasswordField(8);
        submit = new JButton("Submit");


        controlPanel.add(userNameLabel);
        controlPanel.add(userName);
        controlPanel.add(passwordLabel);
        controlPanel.add(password);
        controlPanel.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNameFromField = userName.getText();
                String passwordFromField = password.getText();

       /*   -------------Now further verification on the web page to identify the user from db ----------------*/
       /*   -------------If the user is valid then create the new instance of the main page ----------------*/

                System.exit(0);
                MainView mainView = new MainView();
            }
        });

        mainFrame.add(controlPanel);

        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setText("@ajay");
        statusLabel.setBackground(Color.BLUE);
        statusLabel.setForeground(Color.CYAN);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
}
