package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public TextField TEKST;
    public Button BUTTON;

    public void handleCLick(ActionEvent actionEvent) {
        TEKST.setText("Kliknięto w przycisk.");


    }

}
