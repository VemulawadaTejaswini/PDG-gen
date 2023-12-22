import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();	
        }
       
        int[] ans = new int[N];
    	ans[0]=0;
    	for(int j=0; j<N; j++) {
    		ans[0]=(int) (ans[0]+A[j]*Math.pow(-1,j));
    	}
        for(int i=1; i<N; i++) {
        	ans[i] = 2*A[i-1] - ans[i-1];
        }
        
        String s ="";
        for(int i=0; i<N; i++) {
        	s = s + " " + ans[i];
        }

        System.out.println(s);
    }
}