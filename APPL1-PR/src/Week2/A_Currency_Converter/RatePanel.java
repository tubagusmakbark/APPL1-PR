package Week2.A_Currency_Converter;

// ******************************************************************
// RatePanel.java
//
// Panel for a program that converts different currencies to
// U.S. Dollars
// ******************************************************************
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

public class RatePanel extends JPanel {

    private double[] rate; // exchange rates
    private String[] currencyName;
    private JTextArea result;
    private JLabel empty = new JLabel(" ");
    private JLabel screenTexts;
    private JComboBox<String> selectCurrency;
    private JTextField userInput;
    private DecimalFormat decimalFormat = new DecimalFormat("##.##");

    // ------------------------------------------------------------
    // Sets up a panel to convert cost from one of 6 currencies
    // into U.S. Dollars. The panel contains a heading, a text
    // field for the cost of the item, a combo box for selecting
    // the currency, and a label to display the result.
    // ------------------------------------------------------------
    public RatePanel() {
        this.setBackground(new Color(219, 246, 233));
        this.setLayout(new GridLayout(4, 2, -100, 5));
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel title = new JLabel("How much is that in dollars?");
        title.setForeground(new Color(240, 84, 84));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Helvetica", Font.BOLD, 20));
        // Set up the arrays for the currency conversions
        currencyName = new String[]{"Select the currency..", "EUR (European Euro)", "CAD (Canadian Dollar)", "JPY (Japanese Yen)",
            "AUD (Australian Dollar)", "INR (Indian Rupee)", "MXN (Mexican Peso)"};
        rate = new double[]{0.0, 1.2103, 0.7351, 0.0091, 0.6969, 0.0222, 0.0880};

        result = new JTextArea(" ");
        selectCurrency = new JComboBox<>(currencyName);
        userInput = new JTextField(8);
        selectCurrency.addActionListener(new ComboListener());
        add(title);
        add(empty);
        screenTexts = new JLabel("Input Money :");
        screenTexts.setForeground(new Color(49, 50, 111));
        add(screenTexts);
        add(userInput);
        screenTexts = new JLabel("Select Currencies :");
        screenTexts.setForeground(new Color(49, 50, 111));
        add(screenTexts);
        add(selectCurrency);
        screenTexts = new JLabel("Result :");
        screenTexts.setForeground(new Color(49, 50, 111));
        add(screenTexts);
        result = new JTextArea("");
        result.setEditable(false);
        add(result);
    }

    // ******************************************************
    // Represents an action listener for the combo box.
    // ******************************************************
    private class ComboListener implements ActionListener {

        // --------------------------------------------------
        // Determines which currency has been selected and
        // the value in that currency then computes and
        // displays the value in U.S. Dollars.
        // --------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                int index = selectCurrency.getSelectedIndex();
                result.setText(userInput.getText() + " " + currencyName[index] + " = " + decimalFormat.format(rate[index] * Float.parseFloat(userInput.getText())) + " USD (U.S. Dollars)");
            } catch (NumberFormatException e) {
            }
        }
    }
}
