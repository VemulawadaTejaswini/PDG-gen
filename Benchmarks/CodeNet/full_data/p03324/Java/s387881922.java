import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ans = 1;
		for(int i=1;i<=D;++i){
			ans *= 100;
		}
		System.out.println(ans * N);
		return;
	}
}