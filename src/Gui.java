import javax.swing.*;

public class Gui {
    Controler controler;// = new Controler();
    private JFrame frame = new JFrame("Конвертер");
    private JPanel panel = new JPanel();
    private JTextField value = new JTextField();
    private JTextField result = new JTextField();
    private JButton grammsVKilogramms = new JButton("G v KG");
    private JButton button2 = new JButton("KG v T");


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

        panel.add(grammsVKilogramms);
        grammsVKilogramms.setBounds(70, 10, 70, 30 );
        grammsVKilogramms.addActionListener(e -> controler.buttonPressed());
        panel.add(button2);
        button2.setBounds(150, 10, 70, 30 );
        button2.addActionListener(e -> controler.buttonPressed());
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
