import java.util.*;
 
public class Main {
  static double dp[][][];
  static int n;
  public static void main(String[] args) { //Passes samples, but WA
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    dp = new double[n+1][n+1][n+1];
    int[] arr = new int[3];
    for(int i =0; i< n ;++) {
      int a = in.nextInt()-1;
      arr[a]++;
    } 
    
    System.out.println(dfs(arr[0], arr[1], arr[2]));  
  }

  static double dfs(int one, int two, int three){
     if(one ==0 && two==0 && three==0)
       return 0;
     if(dp[one][two][three]>0) return dp[one][two][three];  
     double re =n;
     if(one>0) re + = one*dfs(one-1,two, three);
     if(two > 0) re+= two*dfs(one+1, two-1, three);
     if(three>0) re+= three*dfs(one, two+1; three-1);
     re /=(one+two+three);
     return dp[one][two][three]=re; 
  }
}

