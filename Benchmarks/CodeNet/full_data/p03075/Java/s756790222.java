import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = new int[5];
		boolean check = true;
		for(int i = 0; i < 5; i++) {
			line[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		ArrayList<Integer> lis = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 5; j++) {
				if(Math.abs(line[i]-line[j]) > k) {
					check = false;
					break;
				}
			}
		}
		if(check)System.out.println("Yay!");
		else System.out.println(":(");
	}
}