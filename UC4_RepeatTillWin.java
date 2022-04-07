package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC4_RepeatTillWin {
	public static final int source = 0;
	public static final int destination = 100;

	public static void main(String[] args) {

		int randomCheck, randomCheck2;
		int position=0, diceRoll=0;
		//While loop condition
		while(position != destination)
		{
			diceRoll++;
			randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
			randomCheck2 = (int) (Math.random() * 10) % 3;
		//using switch case statement
			switch(randomCheck2) {
			case 0:
				System.out.println("No play");
				position += 0;
				break;
			case 1:
				System.out.println("Ladder");
				position += randomCheck;
				break;
			case 2:
				System.out.println("Snake");
				position -= randomCheck;
				break;
			}
			//check the conditions
			if (position == 100) {
				break;
			} else if (position > 100) {
				position -= randomCheck;
				System.out.println("Invalid Dice Face. You are staying on same position.");
			} else if (position < 0) {
				position = source; 
				System.out.println("You came back to start.");
			} else {
				System.out.println("New Position: " + position);
			}
		}
		System.out.println("You won");
	}

}