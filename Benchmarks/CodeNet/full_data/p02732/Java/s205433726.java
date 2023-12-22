
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num0 = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for(int i =0; i<num0; i++) {
			int num = sc.nextInt();
			arr.add(num);
		}
		for(int i=0; i<arr.size();i++) {
			
			int count =0;
			for(int j =0; j<arr.size(); j++) {
				int plus =0;				
				if(arr.get(i).equals(arr.get(j))) {
					plus =1;
				}
				if(i==j) {
					plus=0;
				}
				count += plus;
			}
			System.out.println(count*(count-1)/2);

		}
		
		
		
	}
}