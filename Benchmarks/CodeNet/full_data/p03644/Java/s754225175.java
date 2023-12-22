import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] pow2 = {1,2,4,8,16,32,64};
		int i = 6;
		while(N <= pow2[i]){
			i--;
		}
		System.out.println(pow2[i]);
	}
}