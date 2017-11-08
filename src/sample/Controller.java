package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public javafx.scene.control.Label Label;
    public TextField TEKST1;
    public TextField TEKST2;
    public Button BUTTON;

    public void handleCLick(ActionEvent actionEvent) {
        String pasted;
        pasted=TEKST1.getCharacters().toString() + TEKST2.getCharacters().toString();

        Label.setText(pasted);



    }

}
