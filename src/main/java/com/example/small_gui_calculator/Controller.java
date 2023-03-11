package com.example.small_gui_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label field;

    double var1;
    double var2;

    String var1_in_string;
    String var2_in_string;

    @FXML
    public void button_0()
    {
        String label_text = field.getText();
        if (label_text.length()==0)
        {
            return;
        }
        label_text=label_text+String.valueOf(0);
        field.setText(label_text);

    }

    @FXML
    public void button_1()
    {
        String label_text = field.getText();
        label_text=label_text+String.valueOf(1);
        field.setText(label_text);
    }

    @FXML
    public void button_2()
    {
        String label_text = field.getText();
        label_text=label_text+String.valueOf(2);
        field.setText(label_text);
    }

    @FXML
    public void button_3()
    {
        String label_text = field.getText();
        label_text=label_text+String.valueOf(3);
        field.setText(label_text);
    }

    @FXML
    public void set_label(String in_field)
    {
        field.setText(in_field);
    }
}