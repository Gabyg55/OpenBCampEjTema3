module com.example.tema3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tema3 to javafx.fxml;
    exports com.example.tema3;
}