import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int N = scan.nextInt();		
		int sumA = 0;

		for (int i=0;i<N;i++){
			sumA = sumA + scan.nextInt();
		}
		if (sumA >= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}