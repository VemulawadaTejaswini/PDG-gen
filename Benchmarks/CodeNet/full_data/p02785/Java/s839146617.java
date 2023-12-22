import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
      
        long h[] = new long[N];
      
      long th = 0;

      long ans = 0;
      for(int i=0; i<N; i++){
          h[i] =sc.nextLong();
          th +=h[i];
      }
    Arrays.sort(h);
        if(K>0){
      for(int j=0; j<N-K; j++){

        ans +=h[j];
     }  System.out.println(ans);
          
        }else{ System.out.println(th);}
    }
}