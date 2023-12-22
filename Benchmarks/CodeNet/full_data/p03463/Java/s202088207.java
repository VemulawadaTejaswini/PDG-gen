import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int num = scan.nextInt();
		int alice = scan.nextInt();
		int borys = scan.nextInt();

		// check
		boolean turn = true;
		while(true){
			if(turn){	// alice
				if(alice == 1 && borys == alice + 1){
					System.out.println("Borys");
					break;
				} else if(alice + 1 != borys){
					alice++;
				} else {
					alice--;
				}
			} else {	// borys
				if(borys == num && alice == borys - 1){
					System.out.println("Alice");
					break;
				} else if(borys - 1 != alice){
					borys--;
				} else {
					borys++;
				}
			}

			turn = !turn;
		}

	}
}
