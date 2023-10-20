module com.example.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.app to javafx.fxml;
    exports com.example.app;
    exports com.example.app.Controller;
    opens com.example.app.Controller to javafx.fxml;
    exports com.example.app.Models;
    opens com.example.app.Models to javafx.fxml;
}