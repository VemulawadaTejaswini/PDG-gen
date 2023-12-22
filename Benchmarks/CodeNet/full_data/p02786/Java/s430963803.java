import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long ans = 0;
		long buf = 0;
		while(H > 0){
			H /= 2;
			ans += Math.pow(2,buf);
			buf++;
		}
		System.out.println(ans);
	}
}