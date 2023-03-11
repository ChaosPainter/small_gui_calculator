module com.example.small_gui_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.small_gui_calculator to javafx.fxml;
    exports com.example.small_gui_calculator;
}