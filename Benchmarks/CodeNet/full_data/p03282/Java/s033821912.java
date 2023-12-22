import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		double k = sc.nextDouble();

		int length = s.length();
		int ans = 0;

		for(int i=0; i<length; i++){
			ans = (int)s.charAt(i) - 48;
			k = k - Math.pow((double)ans, 5000000000000L);
			if(k<0){
				break;
			}
		}

		System.out.println(ans);
	}
}