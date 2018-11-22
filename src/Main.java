public class Main {
    public static void main(String[] args)
    {
        init();
    }

    static void init(){
        Controler controler = new Controler();
        Gui gui = new Gui();
        Converter converter = new Converter();
        gui.createGui();
        gui.registerControler(controler);
        controler.registerGui(gui);
        converter.registerControler(controler);
        controler.registerConverter(converter);


    }

}
