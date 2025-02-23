package com.walletmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override 
    public void start(Stage stage) throws Exception {
        // Importando o arquivo fxml
        Parent root = FXMLLoader.load(getClass().getResource("/com/walletmanager/fxml/LoginView.fxml"));
        Scene login = new Scene(root);

        // Definindo de fato a cena que será mostrada na nossa tela
        stage.setScene(login);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}