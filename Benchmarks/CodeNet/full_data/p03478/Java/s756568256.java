import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i<=N; i++) {
			int count = 0;
			int temp = i;
			while(temp > 0) {
				count += temp%10;
				temp/=10;
			}
			if(count >= a && count <= b) total+=i;
		}
		
		System.out.println(total);
	}

}
