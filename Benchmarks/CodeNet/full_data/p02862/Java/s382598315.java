import java.util.*;
public class Main{
  public static final int MOD = (int)(1e9+7);
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int g = 0;
    
    if((x+y)%3!=0)
        System.out.println(0);
    else{
        int n = (2*y-x)/3;
        int m = (2*x-y)/3;
        int e = Math.min(n,m);
        int f = Math.max(n,m);
        if(m<0||n<0)
            System.out.println(0);
        else
            System.out.println(e+com(f,e));
    }
    
  }
  
  public static int com(int n,int k)
  {
      int C[] = new int[k + 1]; 
         
        // nC0 is 1 
        C[0] = 1;   
       
        for (int i = 1; i <= n; i++) 
        { 
            // Compute next row of pascal  
            // triangle using the previous row 
            for (int j = Math.min(i, k); j > 0; j--) 
                C[j] = (C[j] + C[j-1])%MOD; 
        } 
        return C[k]%MOD; 
  }
  
}