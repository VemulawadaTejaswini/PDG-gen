import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner cin = new Scanner(System.in);
			int N = cin.nextInt();
			int[] a = new int[1100000];
			
			for(int i=0;i<N;i++) {
				a[i] = i+1;
			}
			
			int sum = 0;
			for(int i = 0;i<N;i++){
				if(!(a[i]%3==0||a[i]%5==0||a[i]%15==0)) {
					sum+=a[i];
				}
			}
			
			System.out.println(sum);
		
	}

}
