package com.datasiqn.buttonplugin.data.type;

import com.datasiqn.buttonplugin.data.ButtonData;
import edu.wpi.first.shuffleboard.api.data.ComplexDataType;

import java.util.Map;
import java.util.function.Function;

public class ButtonType extends ComplexDataType<ButtonData> {
    public static final ButtonType INSTANCE = new ButtonType();

    private ButtonType() {
        super("button", ButtonData.class);
    }

    @Override
    public Function<Map<String, Object>, ButtonData> fromMap() {
        return map -> {
            String name = (String) map.getOrDefault("name", "");
            long counter = (long) map.getOrDefault("counter", 0);
            return new ButtonData(name, counter);
        };
    }

    @Override
    public ButtonData getDefaultValue() {
        return new ButtonData("Command", 0);
    }
}
