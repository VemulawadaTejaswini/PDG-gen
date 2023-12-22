import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int amount = s.nextInt();
		String slime = s.nextLine();
		int total = 0;
		for(int i = 0; i < amount-1; i++) {
			if(slime.charAt(i) == slime.charAt(i+1)){
				i++;
			}
			else total += 1;
		}
		
		System.out.println(total);
	}
}
