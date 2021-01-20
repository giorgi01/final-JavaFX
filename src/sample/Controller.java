package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField firstNum;

    @FXML
    private TextField operation;

    @FXML
    private TextField secondNum;

    @FXML
    private Label result;

    public void onSubmitButton() {
        int firstN = Integer.parseInt(firstNum.getText());
        int secondN = Integer.parseInt(secondNum.getText());
        if (operation.getText().equals("+")){
            result.setText("შედეგი: " + (firstN + secondN));
        }else{
            result.setText("შედეგი: " + (firstN - secondN));
        }
    }

}
