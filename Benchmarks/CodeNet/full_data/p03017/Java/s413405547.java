
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int fieldSize = sc.nextInt(); // N
			int sNow = sc.nextInt() - 1; // A
			int hNow = sc.nextInt() - 1; // B 
			int sGoal = sc.nextInt() - 1; // C
			int hGoal = sc.nextInt() - 1; // D
			String s = sc.next();
			
			if (s.contains("##")) {
				System.out.println("No");
			} else if (sGoal > hGoal) {
				for (int i = hNow; i <= hGoal; i++) {
					if (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) =='.' && i + 2 < hGoal) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
