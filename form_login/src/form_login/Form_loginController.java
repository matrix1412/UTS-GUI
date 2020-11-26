package form_login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;

public class Form_loginController {


    @FXML
    private TextField tf_user;

    @FXML
    private PasswordField tf_password;

    @FXML
    void onExitClick(ActionEvent event) {
        int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Keluar?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok==0){
        System.exit(0);
        }
    }

    @FXML
    void onSubmitClick(ActionEvent event) {
        System.out.println("Username = " + tf_user.getText());
        System.out.println("Password = " + tf_password.getText());
        int login = showConfirmDialog(null, "Selamat Datang","Welcome",JOptionPane.CLOSED_OPTION);
    }
   
}