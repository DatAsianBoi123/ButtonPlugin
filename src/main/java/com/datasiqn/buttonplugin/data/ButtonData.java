package com.datasiqn.buttonplugin.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

import java.util.Map;

public class ButtonData extends ComplexData<ButtonData> {
    private final String name;
    private final long counter;

    public ButtonData(String name, long counter) {
        this.name = name;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public ButtonData fire() {
        return new ButtonData(name, System.currentTimeMillis());
    }

    @Override
    public Map<String, Object> asMap() {
        return Map.of("name", name, "counter", counter);
    }
}
