package Com.Bridgelabz;
/**
 * @author Prerna
 *
 */
public class UC3_SnakeLadderNoPlay {
public static void main(String[] args) {
		int position=0;
		int randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
		int randomCheck2 = (int) (Math.random() * 10) % 3;
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

	}


}