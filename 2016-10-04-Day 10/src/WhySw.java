
public class WhySw{

	
	public static void main(String[] args){
		
		int val;
		val = 16;
		
		switch (val){
		
		case 5:
		case 50:
			System.out.println("Five or Fifty");
			
		case 7:
			System.out.println("Seven");
			val--;
			
		case 16:
		case 32:
			System.out.println("Val is: " + val);
			break;
			
		default:
			System.out.println("Not one of the above.");
		
		}
	}
}
