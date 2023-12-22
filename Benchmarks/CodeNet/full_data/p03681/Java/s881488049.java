import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    long p = 1000000007l;
    
    boolean check = false;
    if(A == B){
      check = true;
    }else if(A+1 == B || A-1 == B){
      check = false;
    }else{
      System.out.println(0);
      return;
    }
    
    long ans = 0;
    long n = 1;
    long m = 1;
    for(int i = 1; i <= A; i++){
      n = n * i % p;
    }
    for(int i = 1; i <= B; i++){
      m = m * i % p;
    }
    
    if(check){
      ans = (((2 * n) % p) * m) % p;
    }else{
      ans = (n * m) % p;
    }
    System.out.println(ans);
  }
}