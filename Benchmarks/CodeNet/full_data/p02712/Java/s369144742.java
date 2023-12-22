import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		int N = cin.nextInt();
		int[] a = new int[110000];
		
		for(int i=0;i<N;i++) a[i] = i;
		
		int sum = 0;
		for(int i:a) {
			if(!(i%15==0||i%3==0||i%5==0)) sum+=i;
		}
		System.out.println(sum);
	}

}
