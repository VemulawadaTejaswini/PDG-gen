import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int A = scan.nextInt();
		 int B = scan.nextInt();
		 
		 int sum = 0;
		 for (int i = 1; i <= N; i++) {
			 int keta = Integer.toString(i).length();
			 
			 int wk = i,sum_digit = 0;
			 for (int j = keta; j > 0; j--) {
				 sum_digit += wk / (int)(Math.pow(10,j-1));
				 wk = wk % (int)(Math.pow(10,j-1));
			 }
			 
			 if (sum_digit >= A && sum_digit <= B) {
				 sum += i;
			 }
		 }
		 
		 System.out.println(sum);
		 
		 scan.close();

	}

}
