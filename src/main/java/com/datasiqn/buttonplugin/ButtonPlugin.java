package com.datasiqn.buttonplugin;

import com.datasiqn.buttonplugin.data.type.ButtonType;
import com.datasiqn.buttonplugin.widget.ButtonWidget;
import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import java.util.List;
import java.util.Map;

@Description(group = "com.datasiqn", name = "Button Plugin", version = "1.0.0", summary = "Plugin used to display buttons")
public class ButtonPlugin extends Plugin {
    @Override
    public List<DataType> getDataTypes() {
        return List.of(ButtonType.INSTANCE);
    }

    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(ButtonWidget.class));
    }

    @Override
    public Map<DataType, ComponentType> getDefaultComponents() {
        return Map.of(ButtonType.INSTANCE, WidgetType.forAnnotatedWidget(ButtonWidget.class));
    }
}
