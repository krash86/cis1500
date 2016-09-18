import javax.swing.JOptionPane;


public class DemoDialogInput {
	
	public static void main(String [] args){
		
		String s = JOptionPane.showInputDialog("Enter a value:");
		int num = Integer.parseInt(s);
		int twice = num*2;
		JOptionPane.showMessageDialog(null, "You just entered: " + s);
		JOptionPane.showMessageDialog(null, "Double " + num + " equals: " + twice);


		
		
	}

}
