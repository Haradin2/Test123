package sample.test123;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {

    @FXML
    private BottomNavigationButton BtShop;

    @FXML
    private BottomNavigationButton BtHome;

    @FXML
    private BottomNavigationButton BtUser;

    @FXML
    private Button BtWeigh;

    @FXML
    private Button BtScan;

    @FXML
    void GotoHome(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("hello-view");
    }

    @FXML
    void Gotoshop(MouseEvent event) throws IOException {
        HelloApplication.gotoscreen("List page");
    }

}
