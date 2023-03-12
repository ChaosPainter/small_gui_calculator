package com.example.small_gui_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label field;
    Math_class.działanie dzialanie = null;
    double var1;
    double var2;

    String var1_in_string;
    String var2_in_string;

    @FXML
    public void button_0() {
        String label_text = field.getText();
        if (label_text.length() == 0) {
            return;
        }
        label_text = label_text + String.valueOf(0);
        field.setText(label_text);


    }

    @FXML
    public void button_1() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(1);
        field.setText(label_text);
    }

    @FXML
    public void button_2() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(2);
        field.setText(label_text);
    }

    @FXML
    public void button_3() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(3);
        field.setText(label_text);
    }

    @FXML
    public void button_4() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(4);
        field.setText(label_text);
    }

    @FXML
    public void button_5() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(3);
        field.setText(label_text);
    }

    @FXML
    public void button_6() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(6);
        field.setText(label_text);
    }

    @FXML
    public void button_7() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(7);
        field.setText(label_text);
    }

    @FXML
    public void button_8() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(8);
        field.setText(label_text);
    }

    @FXML
    public void button_9() {
        String label_text = field.getText();
        label_text = label_text + String.valueOf(9);
        field.setText(label_text);
    }


    @FXML
    public void button_eq() {
        switch (dzialanie) {
            case ADD:
                var2 = Double.valueOf(field.getText());
                field.setText(String.valueOf(var1 + var2));
                break;
            case SUB:
                var2 = Double.valueOf(field.getText());
                field.setText(String.valueOf(var1 - var2));
                break;
            case MUL:
                var2 = Double.valueOf(field.getText());
                field.setText(String.valueOf(var1 * var2));
                break;
            case DIV:
                var2 = Double.valueOf(field.getText());
                if (var2 == 0) {
                    System.out.println("dzielenie przez zero popraw");
                    field.setText("");
                    var1 = 0;
                    var2 = 0;
                    dzialanie = null;
                    return;
                }
                field.setText(String.valueOf(var1 / var2));
                break;
        }
        dzialanie = null;

    }

    @FXML
    public void button_add() {
        var1 = Double.valueOf(field.getText());
        dzialanie = Math_class.działanie.ADD;
        field.setText("");
    }

    @FXML
    public void button_sub() {
        if (field.getText().length() > 0) {
            var1 = Double.valueOf(field.getText());
            dzialanie = Math_class.działanie.SUB;
            field.setText("");
        }
    }

    @FXML
    public void button_mul() {
        if (field.getText().length() > 0) {
            var1 = Double.valueOf(field.getText());
            dzialanie = Math_class.działanie.MUL;
            field.setText("");
        }
    }

    @FXML
    public void button_div() {
        if (field.getText().length() > 0) {
            var1 = Double.valueOf(field.getText());
            dzialanie = Math_class.działanie.DIV;
            field.setText("");
        }
    }

    @FXML
    public void button_clr()
    {
        field.setText("");
        var1=0;
        var2=0;
        dzialanie=null;
    }

}