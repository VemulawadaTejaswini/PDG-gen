import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int A = sc.nextInt();
		int t = sc.nextInt();
		
		int result = A - t;
		if(result<0) {
			result = 0;
		}
		System.out.println(result);
	}

}
