
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = sc.nextLong();
		sc.close();

		int count = 1;
		int[] b = new int[n-1];
		for(int i=1;i<n;i++){
			if(a[i]>a[i-1]){
				b[i-1] = 1;
			} else if(a[i]<a[i-1]){
				b[i-1] = -1;
			} else {
				b[i-1] = 0;
			}
			//System.out.print(b[i-1]+" ");
		}
		//System.out.println();
		int lastnum = 0;
		for(int i=0;i<n-1;i++){
			if(lastnum*b[i]<0){
				count ++;
				i++;
				if(i<n-1)lastnum = b[i];
			} else if(lastnum == 0&&b[i] != 0){
				lastnum = b[i];
			}
		}
		System.out.println(count);
	}

}