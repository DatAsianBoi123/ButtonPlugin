package com.datasiqn.buttonplugin.widget;

import com.datasiqn.buttonplugin.data.ButtonData;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

@Description(name = "Button", dataTypes = ButtonData.class)
@ParametrizedController("Button.fxml")
public class ButtonWidget extends SimpleAnnotatedWidget<ButtonData> {
    @FXML
    private Pane root;

    @FXML
    private Button button;

    @FXML
    private void initialize() {
        dataProperty().addListener(((observable, oldValue, newValue) -> button.setText(newValue.getName())));

        button.setOnAction(event -> setData(getData().fire()));
    }

    @Override
    public Pane getView() {
        return root;
    }
}
