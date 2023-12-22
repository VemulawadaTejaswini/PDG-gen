import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		if((b-a)%2 == 0){
			System.out.println((b-a)/2);
		} else if((b-a)%2 == 1){
			if((number-b) > a){
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		}
	}
}