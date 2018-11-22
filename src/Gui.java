import javax.swing.*;

public class Gui {
    //Gui gui= new Gui();
    Controler controler;// = new Controler();
    private JFrame frame = new JFrame("Конвертер");
    private JPanel panel = new JPanel();
    private JTextField value = new JTextField();
    private JTextField result = new JTextField();
    private JButton button1 = new JButton("G v KG");

    void createGui(){
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(value);
        panel.setLayout(null);
        value.setBounds(10,10,50,30);
        panel.add(result);
        result.setBounds(10,50,50,30);
        result.setEditable(false);

        panel.add(button1);
        button1.setBounds(70, 10, 70, 30 );
        button1.addActionListener(e -> controler.buttonPressed());
    }

    public Double getTextDoubleValue(){
        return Double.parseDouble(value.getText());
    }

    public void setResultValue(String result){
        this.result.setText(result);
    }

    void registerControler (Controler controler) {
        this.controler = controler;
    }


//    public JTextField getTextValue() {
//        return value;
//    }

//    public void setTextResult(JTextField textResult) {
//        this.result = textResult;
//    }

}
