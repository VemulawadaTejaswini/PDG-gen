import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		sc.close();
		
		long max = Long.MIN_VALUE/2;
		long min = Long.MAX_VALUE/2;
		
		long maxP = 0;
		long minP = 0;
		
		for(int i=0;i<N;i++) {
			if(max < a[i]) {
				max = a[i];
				maxP = i;
 			}
			if(min > a[i]) {
				min = a[i];
				minP = i;
			}
		}
		StringBuilder sb = new StringBuilder();
		int cnt = 2*(N-1); //fixed
		sb.append(cnt + "\n");
		if(max + min >= 0) {
			for(int i=1;i<N;i++) {
				sb.append((maxP+1) + " " + (i+1) + "\n"); 
				sb.append((maxP+1) + " " + (i+1) + "\n"); 
				a[i] += 2*max;
				if(max < a[i]) {
					max = a[i];
					maxP = i;
				}
			}
		}
		else {
			if(true)return;
			for(int i=N-2;i>=0;i--) {
				sb.append((minP+1) + " " + (i+1) + "\n"); 
				sb.append((minP+1) + " " + (i+1) + "\n"); 
				a[i] += 2*min;
				if(min > a[i]) {
					min = a[i];
					minP = i;
				}
			}
		}
		System.out.println(sb.toString());
		//debug 
		//Arrays.stream(a).forEach((i)->System.out.println(i));
	}
	
}