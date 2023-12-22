import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m = sc.nextDouble();
		List<Integer> nums = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			nums.add(temp);
			sum += temp;
		}
		
		double base = sum / (4 * m);
		int canChoose = 0;
		
		for(int num : nums) {
			if(base <= num) {
				canChoose++;
			}
		}

		if(m <= canChoose) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
		
	}
	
}