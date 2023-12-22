import java.util.*

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result_1 = A + B;
		int result_2 = B - A;
		if (B % A == 0){
			System.out.println(result_1);	
		}
		else {
			System.out.println(result_2);
		}
	}
