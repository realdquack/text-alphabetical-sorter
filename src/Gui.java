import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    JLabel outputText;
    JTextField inputText;
    public Gui() {
        GridLayout layout = new GridLayout(2,0);
        this.setSize(800,600);
        this.setLayout(layout);
        inputText = new JTextField();
        inputText.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TextSorter ts = new TextSorter();
                outputText.setText(ts.sortTextalphabetical(inputText.getText()));
            }
        });
        inputText.setColumns(50);
        outputText = new JLabel("Hier kommt der Output hin");
        this.add(inputText);
        this.add(outputText);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
