import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int syou = (M - M%N) / N;
		
		for(int i=syou; i>=1; i--){
			if(M % i == 0){
				System.out.println(i);
				break;
			}
		}
	}
}