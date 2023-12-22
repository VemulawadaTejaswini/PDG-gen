import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i=111; i<=999; i+=111){
			if(n<=i){
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}