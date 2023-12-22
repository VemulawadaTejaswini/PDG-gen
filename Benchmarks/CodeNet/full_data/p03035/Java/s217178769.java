import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int age = Integer.parseInt(line[0]);
		int price = Integer.parseInt(line[1]);
		
		int result =0 ;
		if(age <= 5) {
			result = 0;
		}else if(6<= age && age <= 12) {
			result = price/2;
		}else if(13 <= age) {
			result = price;
		}
		
		System.out.println(result);

		
		
		
	}
}
	
	