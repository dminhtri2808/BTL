package com.example.app.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    private PasswordField confirmUserPassword;

    @FXML
    private Hyperlink login;

    @FXML
    private Button registerButton;

    @FXML
    private TextField sdt;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField userPassword;

    // XỬ LÝ SỰ KIỆN ĐĂNG NHẬP
    public void onDangNhap() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // XỬ LÝ SỰ KIỆN ĐĂNG KÍ



}
