package questions;

import questions.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CheckResults implements ActionListener {
    private JRadioButton jRadioButton;
    private BaseOfAscks baseOfAscks;
    public static int counter = 0;
    private String[] oneAnswer = new String[2];
    public static ArrayList stringsOfResults=new ArrayList();

    public CheckResults() {
    }

    public CheckResults(JRadioButton jRadioButton, BaseOfAscks baseOfAscks) {
        this.jRadioButton = jRadioButton;
        this.baseOfAscks = baseOfAscks;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jRadioButton.getText() == baseOfAscks.radioButtonTexts[Main.labelIndex][5]) {
            oneAnswer[0] = baseOfAscks.radioButtonTexts[Main.labelIndex][0];
            oneAnswer[1] = baseOfAscks.radioButtonTexts[Main.labelIndex][6];
            stringsOfResults.add(oneAnswer);

        }//else System.exit(-1);

    }

    public ArrayList getStringsOfResults() {
        return stringsOfResults;
    }
}
