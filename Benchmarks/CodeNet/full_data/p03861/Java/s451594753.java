import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		int count = 0;
		count = a/x - b/x;

		if(b % x == 0 ){
			count = count + 1 ;
		}

		System.out.println(count);

	}
}