import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int M = 0;
        int k = 0;
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		for(int i=N;i>0;i--) {
			int sum=0;
			for(int j=i;j<N+1;j=j+i) {
				if(b[j-1]==1) {
					sum++;
				}
			}
//	        System.out.println(sum);
			if(sum%2!=a[i-1]) {
//		        System.out.println(i);
				b[i-1]=1;
				M++;
			}
		}
		
        System.out.println(M);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			if(b[i]==1) {
				if(i==N-1) {
					sb.append(i+1);
				} else {
					sb.append(i+1);				
					sb.append(" ");
				}
			}
		}
        System.out.println(sb);
    }
}