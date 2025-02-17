module com.walletmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.walletmanager to javafx.fxml;
    exports com.walletmanager;
}
