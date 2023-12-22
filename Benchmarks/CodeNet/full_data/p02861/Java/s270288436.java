import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        double tmp = 0;
        double road = 0;
      
        for(int i = 0; i < N ; i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
        }
      
        for(int i = 0; i < N; i++){
          for(int j = i + 1; j < N; j++){
            tmp = Math.pow(x[i]-x[j],2) + Math.pow(y[i]-y[j],2);
            road += Math.sqrt(tmp);
          }
        }
      
        int n = 1;
        for(int i = 1; i <= N; i++){
          n *= i;
        }
      
        int C = 1;
        for(int i = 1; i <= N-1; i++){
          C *= i;
        }
      
        int c = n/C;
        
        int num = (n*(N-1))/c;

        double ans = num*road/n;
      
       System.out.println(ans);
	}
}