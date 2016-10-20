/* JOptionPaneInputDialog.java
 * Copyright (c) 2014, HerongYang.com, All Rights Reserved.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class JOptionPaneInputDialog implements ActionListener {
   JFrame myFrame = null;
   public static void main(String[] a) {
      (new JOptionPaneInputDialog()).test();
   }
   private void test() {
      myFrame = new JFrame("showInputDialog() Test");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container myPane = myFrame.getContentPane();
      JButton myButton = new JButton("Show");
      myButton.addActionListener(this);
      myPane.add(myButton);
      myFrame.pack();
      myFrame.setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
      int messageType = JOptionPane.INFORMATION_MESSAGE;
      String answer = JOptionPane.showInputDialog(myFrame, 
         "What's you name?", 
         "Input Dialog Box", messageType);
      System.out.println("Answer: "+answer);
   }
}