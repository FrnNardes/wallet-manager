package com.walletmanager.controller;

import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

public class LoginController extends BaseController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Text verifyLogin;

    @FXML
    private void login(ActionEvent event) throws IOException{
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if(authenticate(username, password)){
            openDashboard(event);
        } else{
            verifyLogin.setText("Usuário ou senha inválidos!");
        }
    }

    private boolean authenticate(String username, String password){
        verifyLogin.setVisible(true);
        return username.equals("admin") && password.equals("123");
    }

    private void openDashboard(ActionEvent event) throws IOException{
        switchScene(event, "Dashboard - WalletManager", "/com/walletmanager/fxml/DashboardView.fxml");
    }
}
