import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = 0;

		if(a >= b){
			if(a >= c) {
				if(b >= c){
					sum = a + b;
				} else {
					sum = a + c;
				}
			} else {
				sum = a + c;
			}
		} else
			if(c >= a){
				sum = b + c;
			} else {
				sum = a + b;
			}
		}

		System.out.println(sum);
	}
	
}