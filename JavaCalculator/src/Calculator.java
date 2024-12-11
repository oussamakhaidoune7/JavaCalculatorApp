import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple calculator application using Swing UI.
 * It creates a graphical user interface with several buttons to perform basic arithmetic operations.
 */

public class Calculator {
    private JPanel Calculator; // The main panel that holds the UI components
    private JTextField txtDisplay; // The text field to display inputs and results.
    private JButton button1; // Button for clearing the display (Clear).
    private JButton button2; // Button for subtraction (-).
    private JButton button3; // Button for multiplication (*).
    private JButton button4; // Button for equals (=) to compute the result.
    private JButton button5; // Button for division (/).
    private JButton button6; // Button for backspace (deletes the last character).
    private JButton a7Button; // Button for number 7.
    private JButton a4Button; // Button for number 4.
    private JButton a1Button; // Button for number 1.
    private JButton a00Button; // Button for adding "00".
    private JButton button11; // Button for addition (+).
    private JButton a8Button; // Button for number 8.
    private JButton a5Button; // Button for number 5.
    private JButton a2Button; // Button for number 2.
    private JButton a0Button; // Button for number 0.
    private JButton button16; // Button for changing the sign (positive/negative) (+/-).
    private JButton a9Button; // Button for number 9.
    private JButton a6Button; // Button for number 6.
    private JButton a3Button; // Button for number 3.
    private JButton button20; // Button for adding a decimal point (.) for decimal numbers.

    double a, b, result; // Variables to store input values and result.
    String operator; // A variable to store the selected operation (+, -, *, /).

    public Calculator() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains("."))
                {
                    double pm = Double.parseDouble(txtDisplay.getToolTipText());
                    pm = pm *-1;
                    txtDisplay.setText(String.valueOf(pm));
                }else
                {
                    long PM = Long.parseLong(txtDisplay.getText());
                    PM = PM *-1;
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains("."))
                {
                    txtDisplay.setText(txtDisplay.getText() + button20.getText());
                }

            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                operator = "+";
                txtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                operator = "-";
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                operator = "*";
                txtDisplay.setText("");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                operator = "/";
                txtDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(txtDisplay.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() -1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());

                if(operator == "+")
                {
                    result = a+b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(operator == "-")
                {
                    result = a-b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(operator == "*")
                {
                    result = a*b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(operator == "/")
                {
                    result = a/b;
                    txtDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
