import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		
		for(int i = A; i <= B; i++) {

			String I = Integer.toString(i);
			if(I.substring(0, 1).equals(I.substring(4,5)) && I.substring(1, 2).equals(I.substring(3,4))) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
