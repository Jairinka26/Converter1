import javax.swing.*;
import java.awt.*;

public class Controler {
    Gui gui;
    Converter converter;
    void registerGui (Gui gui) {
        this.gui = gui;
    }

    void registerConverter (Converter converter){
        this.converter = converter;
    }

    void buttonPressed(){
        gui.getTextDoubleValue();
        gui.setResultValue(Double.toString(converter.grammsVKilogramms(gui.getTextDoubleValue())));
    }
}

