package com.robin.calculator;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;

public class Calculator {
  private JFrame window;
  private JTextField inText, affichageCalc;
  private JButton btnC, btnCE, btnBack, btnDiv, btnMul, btnSub, btnAdd, btnEqual, btnDot, btn0, btn1, btn2, btn3, btn4,
      btn5, btn6, btn7, btn8, btn9, btnMod, btnSqrt, btnPow, btnFact, btnSin, btnCos, btnTan, btnLog, btnLn, btnPi,
      btnE, btnInv, btnParOpen, btnParClose, choixColor;

  private char opt = ' ';
  private boolean go = true;
  private double val = 0;
  private boolean bool = false;

  private Calculator() {
    window = new JFrame("Calculator");
    window.setSize(400, 600);
    window.setLocationRelativeTo(null);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setLayout(null);

    inText = new JTextField();
    inText.setBounds(10, 10, 375, 50);
    inText.setFont(new Font("Arial", Font.PLAIN, 20));
    inText.setHorizontalAlignment(JTextField.RIGHT);
    inText.setEditable(false);
    inText.setBackground(Color.WHITE);
    inText.setForeground(Color.BLACK);
    window.add(inText);

    affichageCalc = new JTextField();
    affichageCalc.setBounds(10, 70, 375, 50);
    affichageCalc.setFont(new Font("Arial", Font.PLAIN, 20));
    affichageCalc.setHorizontalAlignment(JTextField.RIGHT);
    affichageCalc.setEditable(false);
    affichageCalc.setBackground(Color.WHITE);
    affichageCalc.setForeground(Color.BLACK);
    window.add(affichageCalc);

    btnC = new JButton("C");
    btnC.setBounds(10, 130, 90, 50);
    btnC.setFont(new Font("Arial", Font.PLAIN, 20));
    btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText("");
        affichageCalc.setText("");
        opt = ' ';
        go = true;
        val = 0;
        bool = false;
      }
    });
    window.add(btnC);

    btnCE = new JButton("CE");
    btnCE.setBounds(110, 130, 90, 50);
    btnCE.setFont(new Font("Arial", Font.PLAIN, 20));
    btnCE.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnCE.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText("");
      }
    });
    window.add(btnCE);

    btnBack = new JButton("←");
    btnBack.setBounds(210, 130, 90, 50);
    btnBack.setFont(new Font("Arial", Font.PLAIN, 20));
    btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String str = inText.getText();
        if (str.length() > 0) {
          str = str.substring(0, str.length() - 1);
          inText.setText(str);
        }
      }
    });
    window.add(btnBack);

    btnDiv = new JButton("÷");
    btnDiv.setBounds(310, 130, 75, 50);
    btnDiv.setFont(new Font("Arial", Font.PLAIN, 20));
    btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnDiv.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          go = false;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
        }
        opt = '/';
        inText.setText(inText.getText() + "/");
      }
    });
    window.add(btnDiv);

    btn7 = new JButton("7");
    btn7.setBounds(10, 190, 90, 50);
    btn7.setFont(new Font("Arial", Font.PLAIN, 20));
    btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "7");
      }
    });
    window.add(btn7);

    btn8 = new JButton("8");
    btn8.setBounds(110, 190, 90, 50);
    btn8.setFont(new Font("Arial", Font.PLAIN, 20));
    btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "8");
      }
    });
    window.add(btn8);

    btn9 = new JButton("9");
    btn9.setBounds(210, 190, 90, 50);
    btn9.setFont(new Font("Arial", Font.PLAIN, 20));
    btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "9");
      }
    });
    window.add(btn9);

    btnMul = new JButton("×");
    btnMul.setBounds(310, 190, 75, 50);
    btnMul.setFont(new Font("Arial", Font.PLAIN, 20));
    btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnMul.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          go = false;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
        }
        opt = '*';
        inText.setText(inText.getText() + "*");
      }
    });
    window.add(btnMul);

    btn4 = new JButton("4");
    btn4.setBounds(10, 250, 90, 50);
    btn4.setFont(new Font("Arial", Font.PLAIN, 20));
    btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "4");
      }
    });
    window.add(btn4);

    btn5 = new JButton("5");
    btn5.setBounds(110, 250, 90, 50);
    btn5.setFont(new Font("Arial", Font.PLAIN, 20));
    btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "5");
      }
    });
    window.add(btn5);

    btn6 = new JButton("6");
    btn6.setBounds(210, 250, 90, 50);
    btn6.setFont(new Font("Arial", Font.PLAIN, 20));
    btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "6");
      }
    });
    window.add(btn6);

    btnSub = new JButton("-");
    btnSub.setBounds(310, 250, 75, 50);
    btnSub.setFont(new Font("Arial", Font.PLAIN, 20));
    btnSub.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnSub.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          go = false;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
        }
        opt = '-';
        inText.setText(inText.getText() + "-");
      }
    });
    window.add(btnSub);

    btn1 = new JButton("1");
    btn1.setBounds(10, 310, 90, 50);
    btn1.setFont(new Font("Arial", Font.PLAIN, 20));
    btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "1");
      }
    });
    window.add(btn1);

    btn2 = new JButton("2");
    btn2.setBounds(110, 310, 90, 50);
    btn2.setFont(new Font("Arial", Font.PLAIN, 20));
    btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "2");
      }
    });
    window.add(btn2);

    btn3 = new JButton("3");
    btn3.setBounds(210, 310, 90, 50);
    btn3.setFont(new Font("Arial", Font.PLAIN, 20));
    btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "3");
      }
    });
    window.add(btn3);

    btnAdd = new JButton("+");
    btnAdd.setBounds(310, 310, 75, 50);
    btnAdd.setFont(new Font("Arial", Font.PLAIN, 20));
    btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnAdd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          go = false;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
        }
        opt = '+';
        inText.setText(inText.getText() + "+");
      }
    });
    window.add(btnAdd);

    btn0 = new JButton("0");
    btn0.setBounds(10, 370, 90, 50);
    btn0.setFont(new Font("Arial", Font.PLAIN, 20));
    btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + "0");
      }
    });
    window.add(btn0);

    btnDot = new JButton(".");
    btnDot.setBounds(110, 370, 90, 50);
    btnDot.setFont(new Font("Arial", Font.PLAIN, 20));
    btnDot.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnDot.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inText.setText(inText.getText() + ".");
      }
    });
    window.add(btnDot);

    btnEqual = new JButton("=");
    btnEqual.setBounds(210, 370, 90, 50);
    btnEqual.setFont(new Font("Arial", Font.PLAIN, 20));
    btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnEqual.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (opt != ' ') {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
          double val2 = Double.parseDouble(inText.getText());
          switch (opt) {
            case '+':
              val += val2;
              break;
            case '-':
              val -= val2;
              break;
            case '*':
              val *= val2;
              break;
            case '/':
              val /= val2;
              break;
            case '%':
              val %= val2;
              break;
            case '^':
              val = Math.pow(val, val2);
              break;
          }
          inText.setText("" + val);
          opt = ' ';
          go = true;
        }
      }
    });
    window.add(btnEqual);

    btnMod = new JButton("%");
    btnMod.setBounds(310, 370, 75, 50);
    btnMod.setFont(new Font("Arial", Font.PLAIN, 20));
    btnMod.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnMod.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          go = false;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
        }
        opt = '%';
        inText.setText(inText.getText() + "%");
      }
    });
    window.add(btnMod);

    btnSqrt = new JButton("√");
    btnSqrt.setBounds(10, 430, 90, 50);
    btnSqrt.setFont(new Font("Arial", Font.PLAIN, 20));
    btnSqrt.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnSqrt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          val = Math.sqrt(val);
          inText.setText("" + val);
          go = true;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            val = Double.parseDouble(str);
            val = Math.sqrt(val);
            inText.setText("" + val);
          }
        }
      }
    });
    window.add(btnSqrt);

    btnPow = new JButton("^");
    btnPow.setBounds(110, 430, 90, 50);
    btnPow.setFont(new Font("Arial", Font.PLAIN, 20));
    btnPow.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnPow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          go = false;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            inText.setText(str);
          }
        }
        opt = '^';
        inText.setText(inText.getText() + "^");
      }
    });
    window.add(btnPow);

    btnFact = new JButton("!");
    btnFact.setBounds(210, 430, 90, 50);
    btnFact.setFont(new Font("Arial", Font.PLAIN, 20));
    btnFact.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnFact.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          val = fact(val);
          inText.setText("" + val);
          go = true;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            val = Double.parseDouble(str);
            val = fact(val);
            inText.setText("" + val);
          }
        }
      }
    });
    window.add(btnFact);

    btnSin = new JButton("sin");
    btnSin.setBounds(310, 430, 75, 50);
    btnSin.setFont(new Font("Arial", Font.PLAIN, 20));
    btnSin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnSin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (go) {
          val = Double.parseDouble(inText.getText());
          val = Math.sin(val);
          inText.setText("" + val);
          go = true;
        } else {
          String str = inText.getText();
          if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
            val = Double.parseDouble(str);
            val = Math.sin(val);
            inText.setText("" + val);
          }
        }
      }
    });
    window.add(btnSin);