
public class Converter {
    Controler controler;

    void registerControler (Controler controler) {
        this.controler = controler;
    }

    Double grammsVKilogramms (double value){
        return value/1000 ;
    }

}
