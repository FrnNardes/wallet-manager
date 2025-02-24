package com.walletmanager.controller;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;

public class LoginController {
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/walletmanager/fxml/DashboardView.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Dashboard - WalletManager");
        stage.centerOnScreen();
        stage.show();
    }
}
