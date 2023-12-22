import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] A = sc.nextLine().split(" ");
    int N = Integer.parseInt(A[0]);
    int M = Integer.parseInt(A[1]);
    String S = sc.nextLine();
    String T = sc.nextLine();
    
    int l = lcm(N, M);
    
    System.out.println(l > N && l > M ? l : -1);
  }
  public static int gcd(int a, int b){
    if(b < a){
      return gcd(b, a);
    }
    
    if(a == 0){
      return b;
    }
    
    return gcd(b%a, a);
  }
  
  public static int lcm(int n, int m){
    return (n*m)/gcd(n, m);
  }
}