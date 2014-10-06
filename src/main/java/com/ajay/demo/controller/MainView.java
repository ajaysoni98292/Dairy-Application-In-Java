package com.ajay.demo.controller;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ajay on 6/10/14.
 */
public class MainView {

    private JFrame mainFrame;
    private JCheckBox checkBox;
    private JButton submit;
    private JComboBox dropdown;

    public MainView() {
        prepareUI();
    }

    public void prepareUI() {
        mainFrame = new JFrame("Main Page");
        mainFrame.setSize(1000,1000);
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        defaultComboBoxModel.addElement("A");
        defaultComboBoxModel.addElement("B");
        defaultComboBoxModel.addElement("C");
        defaultComboBoxModel.addElement("D");

        JComboBox jComboBox = new JComboBox(defaultComboBoxModel);
        jComboBox.setSelectedIndex(0);

        JScrollPane jScrollPane = new JScrollPane(jComboBox);
        mainFrame.add(jScrollPane);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setVisible(true);
    }
}
