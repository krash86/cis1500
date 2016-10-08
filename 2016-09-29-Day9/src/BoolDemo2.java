import javax.swing.JOptionPane;

public class BoolDemo2{

	public static void main(String [] args)
   {
      // WRITE THE CODE THAT SHOULD GO HERE!
	   String purchase = JOptionPane.showInputDialog("How much was your purchase?");
	   double price = Double.parseDouble(purchase);
	   
	   double tax = price*.06;
	   
	   JOptionPane.showMessageDialog(null, "The tax on that $" + String.format("%,.2f", price)
	   + " purchase is $" + String.format("%,.2f",tax) + ".");
	   
   }
	
}