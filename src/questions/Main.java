package questions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int labelIndex = 0;
    public static ArrayList<String> stringsOfResults = new ArrayList();
    static JRadioButton[] jRadioButtons = new JRadioButton[4];
    static String[][] buttonTexts;

    public static void main(String[] args) {


        BaseOfAscks baseOfAscks = new BaseOfAscks();
        buttonTexts = baseOfAscks.radioButtonTexts;
        JLabel label = new JLabel();
        label.setText(buttonTexts[0][0]);
        label.setBounds(30, 40, 550, 20);

        System.out.println(Arrays.deepToString(jRadioButtons));
        for (int i = 0; i < 4; i++) {
            jRadioButtons[i] = new JRadioButton();
            jRadioButtons[i].setText(buttonTexts[0][i + 1]);
            jRadioButtons[i].setBounds(50, 80 + i * 30, 200, 20);

        }

        Panel panel = new Panel(jRadioButtons, label);


        panel.b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (labelIndex == baseOfAscks.radioButtonTexts.length - 2) {
                    panel.b1.setEnabled(false);
                    panel.b2.setEnabled(true);
                }
                if (labelIndex < baseOfAscks.radioButtonTexts.length - 1) {
                    labelIndex++;
                    for (int i = 0; i < 4; i++) {
                        //jRadioButtons[i] = new JRadioButton();
                        jRadioButtons[i].setText(buttonTexts[labelIndex][i + 1]);
                        jRadioButtons[i].setBounds(50, 80 + i * 30, 200, 20);

                    }

                    panel.label.setText(buttonTexts[labelIndex][0]);
                    panel.bg.clearSelection();
                }
            }
        });


        panel.b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.label.setText("Correct ansvers -   " + String.valueOf(panel.getStringsOfResults().size() / 2) + ":");
                JLabel[] jLabels = new JLabel[panel.getStringsOfResults().size()];
                for (int i = 0; i < panel.getStringsOfResults().size() / 2; i++) {
                    jLabels[i] = new JLabel();
                    jLabels[i].setText(panel.getStringsOfResults().get(i * 2) + ": ");
                    jLabels[i].setBounds(50, 80 + i * 30, 600, 20);

                }
                for (int i = 0; i < panel.getStringsOfResults().size() / 2; i++) {
                    jLabels[i + panel.getStringsOfResults().size() / 2] = new JLabel();
                    jLabels[i + panel.getStringsOfResults().size() / 2].setText(panel.getStringsOfResults().get(i * 2 + 1));
                    jLabels[i + panel.getStringsOfResults().size() / 2].setBounds(600, 80 + i * 30, 100, 20);

                }


                //20 * jLabels.length + 80
                Panel panel2 = new Panel(label, jLabels, 30 * jLabels.length / 2 + 190);

                panel2.b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        panel.setVisible(false); //you can't see me!
                        panel.dispose(); //Destroy the JFrame object
                        panel2.setVisible(false); //you can't see me!
                        panel2.dispose(); //Destroy the JFrame object
                        System.exit(0);

                    }
                });


            }
        });


        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setVisible(true);


    }
}
