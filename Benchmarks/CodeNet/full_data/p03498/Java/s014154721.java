import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int min = 0;
		int max = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			if(a[i]<a[min])
				min = i;
			if(a[i]>a[max])
				max = i;
		}
		
		pw.println(2*N-1);
		if(Math.abs(a[max]) >= Math.abs(a[min])) {
			for(int i=0; i<N; i++)
				pw.println((max+1)+" "+(i+1));
			for(int i=0; i<N-1; i++)
				pw.println((i+1)+" "+(i+2));
		} else {
			for(int i=0; i<N; i++)
				pw.println((min+1)+" "+(i+1));
			for(int i=N-1; i>0; i--)
				pw.println((i+1)+" "+i);
		}
		
		sc.close();
		pw.close();
	}
}
