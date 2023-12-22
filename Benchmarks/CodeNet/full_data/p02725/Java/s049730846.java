import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int N = sc.nextInt();
		int max = 0;
		int data[] = new int[N];
		int data1[] = new int[N];
		for(int i = 0;i<N;i++) {
			data[i] = sc.nextInt();
		}
		for(int i =0; i<N-1; i++) {
			data1[i] = data[i+1]-data[i];
			if(i ==N-1)data1[i] = Math.abs(data[i]-data[i+1]);
		
		}
		for(int i=0;i<N;i++) {
			max = Math.max(max,data1[i]);
		}
		System.out.println(k-max);
	}

}