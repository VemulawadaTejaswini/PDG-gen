import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int resultEven =0;
    int resultOdd=0;
    if(N>1){
      resultEven=nCr(N,2);
    }
    if(M>1){
      resultOdd=nCr(M,2);
    }
    
    int result=resultEven+resultOdd;
    
    
    System.out.println(result);
  }
  static int nCr(int n, int r) 
{ 
    return fact(n) / (fact(r) * 
                  fact(n - r)); 
} 
  
// Returns factorial of n 
static int fact(int n) 
{ 
    int res = 1; 
    for (int i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
}
