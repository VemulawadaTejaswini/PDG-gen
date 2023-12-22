import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long[] A = new long[(int)N];
        int k=1;
        int ans=0;
        for(int i=0;i<N;i++) {
        	A[i] = sc.nextLong();
        }

        for(int i=0;i<N;i++) {
        	if(A[i]==k) {
        		k++;
        	}else {
        		ans++;
        	}
        }
        if(ans==N) {
        	ans=-1;
        }
        System.out.println(ans);	
        
        
    }
    

}