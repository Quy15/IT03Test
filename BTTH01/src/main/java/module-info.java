module com.mycompany.btth01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.btth01 to javafx.fxml;
    exports com.mycompany.btth01;
}
