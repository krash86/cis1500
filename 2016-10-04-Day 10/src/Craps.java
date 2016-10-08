
public class Craps {
	
	public static void main(String[] args){
		
		Random scan = new random();
		
		//roll die1
		int die1 = rand.nextInt(6) + 1;
		System.out.println(die1);
		
		//roll die2
		int die2 = rand.nextInt(6) + 1;
		System.out.println(die2);
		
		//add them together
		int sum = die1 + die2;
		
		switch(sum){
		
		case 7:
		case 11:
			
			System.out.println("You WIN!");
			break;
			
		case 2:
		case 3:
		case 12:
		}
	}

}
