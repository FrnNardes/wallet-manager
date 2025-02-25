package com.walletmanager.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DashboardController extends BaseController {

    @FXML
    private void openAddInvestmentView(ActionEvent event) throws IOException{
        switchScene(event, "AddInvestment - WalletManager", "/com/walletmanager/fxml/AddInvestmentView.fxml");
    }
}
