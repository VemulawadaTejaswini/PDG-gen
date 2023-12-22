import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long L = scan.nextLong();
		long R = scan.nextLong();
		
		long min = 2019;
		
		int Lm = (int)(L % 2019);
		int Rm = (int)(R % 2019);
		
		for(int i = Lm; i < Rm; i++) {
			for(int j = i + 1; j <= Rm; j++) {
				if(min > i * j) {
					min = i * j;
				}
			}
		}
		
		System.out.println(min);
		scan.close();
	}

}