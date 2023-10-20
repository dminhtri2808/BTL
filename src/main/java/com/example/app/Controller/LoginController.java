package com.example.app.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private Hyperlink forgotPassword;

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink register;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField userPassword;

    @FXML
    private Label text;

    // XỬ LÝ SỰ KIỆN ĐĂNG KÍ
    public void onDangKi() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/register.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //XỬ LÝ SỰ KIỆN QUÊN MẬT KHẨU
    public void onQuenMK() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/forgotPassword.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //XỬ LÝ SỰ KIỆN ĐĂNG NHẬP
    public void onLogin() throws Exception {
        if(userName.getText().equals("dangminhtri") && userPassword.getText().equals("123456")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {
            text.setText("tài khoản hoặc mật khẩu không chính xác");
        }
    }


}
