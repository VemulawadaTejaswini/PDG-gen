import java.util.*;

public class Main {
    
    int n ;  
    int W ;
    int[] w , v;
    
    Main(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();W=sc.nextInt();
        w=new int[n];v=new int[n];
        memo= new int[n][W+1];
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();v[i]=sc.nextInt();
        }
        sc.close();
    }
    
    void start(){
        System.out.println(napm(n-1,W));
    }
    
    int[][] memo ;
    int napm(int i, int p){ 
       if (i < 0) return 0;
       if(memo[i][p]> 0) return memo[i][p];
       if (p < w[i])  {memo[i][p] = napm(i-1, p); return memo[i][p];} 
       memo[i][p] = Math.max(napm(i-1, p), napm(i-1, p-w[i]) + v[i]); 
          return memo[i][p];
   }
    public static void main(String[] args) throws Exception {
        new Main().start();
    }
}
