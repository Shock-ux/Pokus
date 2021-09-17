module com.example.fxtry {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxtry to javafx.fxml;
    exports com.example.fxtry;
}