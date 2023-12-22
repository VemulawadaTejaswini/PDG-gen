import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int x=sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int k=0;
		int i=0;
		

		while(i<N){
			x-=a[i];
			i++;
			k++;
			if(x<0){
				k--;
				break;
			}
		}
		if(i==N && x>0) k--;

		System.out.println(k);
	}
}
