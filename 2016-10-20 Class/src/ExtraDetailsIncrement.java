
public class ExtraDetailsIncrement {
	
	public static void main(String [] args){
		
		int x = 10;
		int y = x++;
		System.out.println("x: " + x + " y: " + y);
		
		
		int a = 5;
		int b = 2 * a++;
		System.out.println(a);
		System.out.println(b);
		
		// a is six and b is 10
		
		int val = a++ + ++b;
		System.out.println(val);
	}

}
