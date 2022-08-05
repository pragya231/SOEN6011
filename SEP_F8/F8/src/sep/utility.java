package sep;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


/** The Class Calculator. */
public class utility extends JFrame {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant VALIDATION_MESSAGE. */
    private static final String VALIDATION_MESSAGE = "Please enter atleast two valid numbers separated by space ";
    /** The text field input. */
    private static JTextField FieldToInput;
    /** variable used in arithmeticOperation method. */
    double input;
    /** variable used in arithmeticOperation method. */
    double input2;
    /** variable used in arithmeticOperation method. */
    int expCounter = 0;
    /** variable used in arithmeticOperation method. */
    double output;
    /** condition variables used in arithmeticOperation method. */
    int calculation;
    /** The text error. */
    private JTextField textError;
    /** button to press zero. */
    private JButton buttonZero;
    /** button to press One. */
    private JButton buttonOne;
    /** button to press Two. */
    private JButton buttonTwo;
    /** button to press Three. */
    private JButton buttonThree;
    /** button to press Four. */
    private JButton buttonFour;
    /** button to press Five. */
    private JButton buttonFive;
    /** button to press Six. */
    private JButton buttonSix;
    /** button to press Seven. */
    private JButton buttonSeven;
    /** button to press Eight. */
    private JButton buttonEight;
    /** button to press Nine. */
    private JButton buttonNine;
    /** button to press sigma */
    private JButton buttonSigma;
    /** button to press dot sign. */
    private JButton buttonDot;
    /** button to press equal sign. */
    private JButton buttonspace;
    /** button to press minus sign. */
    private JButton buttonMinus;
    /** button to press  back sign. */
    private JButton buttonBack;
    /** label  to press arithmetic use. */
    private JLabel label;


    /** Instantiates a new calculator. */
    public utility() {
        setResizable(false);
        setFont(new Font("Dialog", Font.BOLD, 14));
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 515, 415);
        getContentPane().setLayout(null);

        FieldToInput = new JTextField();
        FieldToInput.setHorizontalAlignment(SwingConstants.RIGHT);
        FieldToInput.setFont(new Font("Kartika", Font.BOLD, 20));
        FieldToInput.setBounds(21, 35, 472, 35);
        FieldToInput.setBorder(null);
        getContentPane().add(FieldToInput);
        FieldToInput.setColumns(10);

        buttonDot = new JButton(".");
        buttonDot.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + ".");
                    }
                });
        buttonDot.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonDot.setBounds(229, 141, 56, 35);
        getContentPane().add(buttonDot);

        buttonZero = new JButton("0");
        buttonZero.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "0");
                    }
                });
        buttonZero.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonZero.setBounds(21, 291, 56, 35 );
        getContentPane().add(buttonZero);

        buttonOne = new JButton("1");
        buttonOne.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "1");
                    }
                });
        buttonOne.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonOne.setBounds(21, 235, 56, 35);
        getContentPane().add(buttonOne);

        buttonTwo = new JButton("2");
        buttonTwo.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "2");
                    }
                });
        buttonTwo.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonTwo.setBounds(87, 235, 56, 35);
        getContentPane().add(buttonTwo);

        buttonThree = new JButton("3");
        buttonThree.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "3");
                    }
                });
        buttonThree.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonThree.setBounds(153, 235, 56, 35);
        getContentPane().add(buttonThree);

        buttonFour = new JButton("4");
        buttonFour.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "4");
                    }
                });
        buttonFour.setFont(new Font("Ebrima", Font.BOLD, 20));
        buttonFour.setBounds(21, 187, 56, 35);
        getContentPane().add(buttonFour);

        buttonFive = new JButton("5");
        buttonFive.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "5");
                    }
                });
        buttonFive.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonFive.setBounds(87, 187, 56, 35);
        getContentPane().add(buttonFive);

        buttonSix = new JButton("6");
        buttonSix.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "6");
                    }
                });
        buttonSix.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonSix.setBounds(153, 187, 56, 35);
        getContentPane().add(buttonSix);

        buttonSeven = new JButton("7");
        buttonSeven.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "7");
                    }
                });
        buttonSeven.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonSeven.setBounds(21, 141, 56, 35);
        getContentPane().add(buttonSeven);

        buttonEight = new JButton("8");
        buttonEight.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "8");
                    }
                });
        buttonEight.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonEight.setBounds(87, 141, 56, 35);
        getContentPane().add(buttonEight);

        buttonNine = new JButton("9");
        buttonNine.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "9");
                    }
                });
        buttonNine.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonNine.setBounds(153, 141, 56, 35);
        getContentPane().add(buttonNine);

        buttonMinus = new JButton("-");
        buttonMinus.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + "-");
                    }
                });
        buttonMinus.setFont(new Font("Kartika", Font.BOLD, 20));
        buttonMinus.setBounds(229, 82, 57, 45);
        getContentPane().add(buttonMinus);
        
       
        
        buttonSigma = new JButton("Sigma(σ)");
        buttonSigma.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // clear error message
                textError.setVisible(false);

                // get focus
                FieldToInput.requestFocus();
                String str = FieldToInput.getText();
                arithmeticOperation(str);
            }
        });
        buttonSigma.setFont(new Font("Kartika", Font.BOLD, 15));
        buttonSigma.setBounds(87, 290, 122, 35);
        getContentPane().add(buttonSigma);



        buttonspace = new JButton(" ");
        buttonspace.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	FieldToInput.setText(FieldToInput.getText() + " ");
                    }
                });
        buttonspace.setBounds(229, 187, 56, 138);
        getContentPane().add(buttonspace);

        JButton buttonClear = new JButton("Clear");
        // To put the clear button
        buttonClear.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        label.setText("");
                        FieldToInput.setText("");
                        FieldToInput.requestFocus();
                        FieldToInput.setText("");
                        textError.setVisible(false);
                    }
                });
        buttonClear.setFont(new Font("Kartika", Font.BOLD, 13));
        buttonClear.setBounds(21, 82, 88, 45);
        getContentPane().add(buttonClear);

        buttonBack = new JButton("Back");
        buttonBack.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int length = FieldToInput.getText().length();
                        int number = FieldToInput.getText().length() - 1;
                        if (length > 0) {
                            StringBuilder sbBuilder = new StringBuilder(FieldToInput.getText());
                            sbBuilder.deleteCharAt(number);
                            FieldToInput.setText(sbBuilder.toString());
                        }
                    }
                });
        buttonBack.setFont(new Font("Kartika", Font.BOLD, 13));
        buttonBack.setBounds(120, 82, 88, 45);
        getContentPane().add(buttonBack);

        textError = new JTextField();
        textError.setVisible(false);
        textError.setBorder(null);
        textError.setFont(new Font("Kartika", Font.PLAIN, 18));
        textError.setEditable(false);
        textError.setText("Please try some other numbers");
        textError.setBounds(21, 335, 515, 34);
        getContentPane().add(textError);
        textError.setColumns(10);

        label = new JLabel("");
        label.setFont(new Font("Kartika", Font.BOLD, 15));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setForeground(new Color(192, 57, 43));
        label.setBounds(335, 11, 128, 25);
        getContentPane().add(label);
    }

    /**
     * This is the main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        try {
                            utility frame = new utility();
                            // textField get focus
                            frame.addWindowFocusListener(
                                    new WindowAdapter() {
                                        public void windowGainedFocus(WindowEvent e) {
                                        	FieldToInput.requestFocusInWindow();
                                        }
                                    });
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

    /**
     * Checks if input is a Number.
     *
     * @param inputDataString the inputDataString
     * @return true, if the input is a real number
     */
    public static boolean numericInputCheck(String inputDataString) {
        try {
            new BigDecimal(inputDataString).toString();
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Arithmetic operation.
     *
     * 
     */
    public void arithmeticOperation(String str) {
        DecimalFormat df = new DecimalFormat("#.#####");
        String[] splitter = str.split(" ");
        double[] arr = new double[splitter.length];
        for (int i=0; i<arr.length;i++)
            arr[i] = Integer.parseInt(splitter[i]);

        double result = stdev.calSD(arr);
        String s = String.valueOf(result);
        if (s == "NaN") {
        	FieldToInput.setText(df.format(0));
        }
        else {
        	 FieldToInput.setText(df.format(result));
        
        }
        FieldToInput.setText(df.format(result));
    }
}

