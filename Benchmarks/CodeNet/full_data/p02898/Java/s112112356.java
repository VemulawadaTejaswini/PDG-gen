import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] firstLineArr = sc.nextLine().split(" ");
		String[] secondLineArr = sc.nextLine().split(" ");
		sc.close();
		
		int n = Integer.parseInt(firstLineArr[0]);
		int k = Integer.parseInt(firstLineArr[1]);
		
		int numOfRider = 0;
		
		for(int i = 0; i < n; i++) {
			if(k <= Integer.parseInt(secondLineArr[i])) {
				numOfRider++;
			}
		}
		
		System.out.println(numOfRider);
	}

}
