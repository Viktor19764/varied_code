package questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Panel extends JFrame {
    private ArrayList<String> stringsOfResults = new ArrayList();
    BaseOfAscks baseOfAscks = new BaseOfAscks();
    JRadioButton[] jRadioButtons = new JRadioButton[4];
    JLabel label;
    JLabel[] jLabels;
    ButtonGroup bg;
    JButton b1;
    JButton b2;
    JButton b3;
    int heightResultsPanel;
    //JOptionPane jOptionPane;

    public final int FRAME_WIDTH = 590;
    public final int FRAME_HEIGHT = 350;


    public Panel(JLabel label, JLabel[] jLabels, int heightResultsPanel) throws HeadlessException {
        this.label = label;
        this.jLabels = jLabels;
        this.heightResultsPanel = heightResultsPanel;
        this.b3 = new JButton("OK");
        //this.jOptionPane = new JOptionPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(700, this.heightResultsPanel);
        add(label);
        for (JLabel jLabel : jLabels) {
            add(jLabel);
        }

        b3.setBounds(300, 30 * jLabels.length / 2 + 100, 100, 30);
        add(b3);
    }

    public Panel(JRadioButton[] jRadioButtons, JLabel label) throws HeadlessException {
        this.jRadioButtons = jRadioButtons;
        this.label = label;
        this.bg = new ButtonGroup();
        this.b1 = new JButton("Next");
        b1.setBounds(100, 240, 100, 30);
        this.b2 = new JButton("Result");
        b2.setBounds(300, 240, 100, 30);
        b2.setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
        add(label);
        for (JRadioButton jRadioButton : jRadioButtons) {
            add(jRadioButton);
            bg.add(jRadioButton);


            jRadioButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (jRadioButton.getText() == baseOfAscks.radioButtonTexts[Main.labelIndex][5]) {
                        stringsOfResults.add(baseOfAscks.radioButtonTexts[Main.labelIndex][0]);
                        stringsOfResults.add(baseOfAscks.radioButtonTexts[Main.labelIndex][5]);

                    }


                }
            });

        }
        add(b1);
        add(b2);


    }



    /* JLabel jLabel = new JLabel("Que1: Which one among these is not a datatype");
        jLabel.setFont(new Font("Arial", Font.BOLD, 12));
        jLabel.setBounds(25, 42, 600, 30);
        add(jLabel);
        JRadioButton jRadioButton1 = new JRadioButton("int");
        JRadioButton jRadioButton2 = new JRadioButton("Float");
        JRadioButton jRadioButton3 = new JRadioButton("boolean");
        JRadioButton jRadioButton4 = new JRadioButton("char");

        jRadioButton1.setBounds(50, 77, 100, 30);
        jRadioButton2.setBounds(50, 109, 100, 30);
        jRadioButton3.setBounds(50, 141, 100, 30);
        jRadioButton4.setBounds(50, 173, 100, 30);

        for (int i = 0; i < 4; i++) {

        }

        add(jRadioButton1);
        add(jRadioButton2);
        add(jRadioButton3);
        add(jRadioButton4);

        JButton buttonNext = new JButton("Next");
        buttonNext.setFont(new Font("Arial", Font.BOLD, 13));
        buttonNext.setBounds(95, 243, 100, 30);
        add(buttonNext);
    }*/

   /* public void setjRadioButtons(JRadioButton[] jRadioButtons) {
        this.jRadioButtons = jRadioButtons;
    }
*/

    public ArrayList<String> getStringsOfResults() {
        return stringsOfResults;
    }
}


