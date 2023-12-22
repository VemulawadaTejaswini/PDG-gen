import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Tmin = sc.nextInt();
		int min = Tmin;
		int count=0;
		int ans =0;
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(Tmin>a) {
				Tmin = b;
				ans =a;
				count++;
			}
		}
		if(count>0) {
			System.out.println(ans);
		}
		else if(count==0) {
			System.out.println("TLE");
		}
	}
	 }