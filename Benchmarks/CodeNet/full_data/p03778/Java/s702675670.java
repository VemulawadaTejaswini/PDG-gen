import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gap = 0;
		if(a+w < b) {
			gap = b - (a + w);
		}else if(a > b + w) {
			gap = a - (b + w);
		}
		System.out.println(gap);
	}

}