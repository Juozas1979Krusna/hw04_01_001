
// Java program to create a blank text
// field of definite number of columns.
import java.awt.event.*;
import javax.swing.*;
import        javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Random;
import java.lang.Math;
class hw04_01_001 extends JFrame implements ActionListener {

    // JTextField
    static JTextField t01;
    static JTextField t02;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b01;
    // default constructor
    hw04_01_001()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("hw04_01_001");

        // create a label to display text

        t01 = new JTextField(80);
        t02 = new JTextField(80);

        // create a new button
        b01 = new JButton("To Generate");

        // create a object of the text class
        hw04_01_001 te = new hw04_01_001();

        // addActionListener to button
        b01.addActionListener(te);

        JPanel p = new JPanel();

        // add buttons and textfield to panel

        p.add(b01);
        p.add(t01);
        p.add(t02);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
    }

    public void actionPerformed(ActionEvent e)
    {
        Random rand = new Random();
        int arraySize = 30;
        int i = 0;
        int j = 0;
        int iniSort;
        boolean uniqueFill = true;
        boolean startSort = true;
        boolean innertSort;
        boolean uniqueNum ;
        String i_StrNonPrint = "";
        String i_outStrPrint = "";
        String i_outStrSortPrint = "";
        String comm_outStrPrint = ", ";
        String s = e.getActionCommand();
        int rawArray[] = new int[arraySize];
        if (s.equals("To Generate")) {
            while (uniqueFill == true) {
                int int_random01 = (rand.nextInt(9) + 1);
                int int_random02 = (rand.nextInt(10));
                int int_random03 = (10 * int_random01) + int_random02;

                if (i > 0) {
                    uniqueNum = true;
                    for (j = 0; j < i ; j++) {
                        if (rawArray[j] == int_random03) {
                            uniqueNum = false;
                        }
                    }
                    if (uniqueNum == false) {
                    }else {
                        rawArray[i] = int_random03;
                        i++;
                    }
                }else {
                    rawArray[i] = int_random03;
                    i++;
                }
                if (i == arraySize) {
                    uniqueFill = false;
                }
            }
        }
        for (i = 0; i < arraySize; i++) {
            i_StrNonPrint = String.valueOf(rawArray[i]);
            if (i == 0) {
                i_outStrPrint = i_StrNonPrint;
            } else {
                i_outStrPrint = i_outStrPrint + comm_outStrPrint + i_StrNonPrint;
            }
        }
        i = 0;
        while (startSort == true) {
            j = i;
            innertSort = true;
            while (innertSort == true) {
                if (rawArray[i] > rawArray[j+1]){
                    iniSort = rawArray[i];
                    rawArray[i] = rawArray[j+1];
                    rawArray[j+1]=iniSort;
                }
                j++;
                if (j == arraySize-1) {
                    innertSort = false;
                }
            }
            i++;
            if (i == arraySize-1) {
                startSort = false;
            }
        }
        for (i = 0; i < arraySize; i++) {
            i_StrNonPrint = String.valueOf(rawArray[i]);
            if (i == 0) {
                i_outStrSortPrint = i_StrNonPrint;
            } else {
                i_outStrSortPrint = i_outStrSortPrint + comm_outStrPrint + i_StrNonPrint;
            }
        }
        t01.setText(i_outStrPrint);
        t02.setText(i_outStrSortPrint);
    }
}




