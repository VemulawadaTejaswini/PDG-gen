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
				if(a[j-1]==1) {
					sum++;
				}
			}
//	        System.out.println(sum);
			if(sum%2==1) {
//		        System.out.println(i);
		        b[M]=i;
				M++;
			}
		}
		
        System.out.println(M);
		StringBuilder sb = new StringBuilder();
		for(int i=M-1;i>-1;i--) {
			if(i==0) {
				sb.append(b[i]);
			} else {
				sb.append(b[i]);				
				sb.append(" ");
			}
		}
        System.out.println(sb);
    }
}