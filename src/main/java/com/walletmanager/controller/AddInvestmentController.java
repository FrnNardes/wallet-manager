package com.walletmanager.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddInvestmentController extends BaseController{
    @FXML
    private void openDashboard(ActionEvent event) throws IOException{
        switchScene(event, "Dashboard - WalletManager", "/com/walletmanager/fxml/DashboardView.fxml");
    }
}
