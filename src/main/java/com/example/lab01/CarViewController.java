package com.example.lab01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CarViewController {

    @FXML
    private TextField componyNameTextField;

    @FXML
    private TextField carNameTextField;

    @FXML
    private TextField modelTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void submitForm(ActionEvent event) {

        String companyName = componyNameTextField.getText();
        String carName = carNameTextField.getText();
        String model = modelTextField.getText();
        int price = Integer.parseInt(priceTextField.getText());


        Car car = new Car(companyName, carName, model, price);

        resultLabel.setText(car.getinfo());

    }

}
