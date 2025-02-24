module com.walletmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.walletmanager to javafx.fxml;
    exports com.walletmanager;
    opens com.walletmanager.controller to javafx.fxml;
    exports com.walletmanager.controller to javafx.fxml;
}
