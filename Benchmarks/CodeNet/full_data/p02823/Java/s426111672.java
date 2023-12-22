import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long dis = Math.abs(a-b);
		long count = 0;
		if(dis%2==0) {
		while(dis != 0) {
			a++;
			b--;
			dis = Math.abs(a-b);
			count++;
		}
		
		}
		else {
			long b_dis = n-b;
			long a_dis = a-1;
			if(a_dis<=b_dis) {
				count = b-1;
			}
			else {
				count = n-a;
			}
		}
		System.out.println(count);
	}
}