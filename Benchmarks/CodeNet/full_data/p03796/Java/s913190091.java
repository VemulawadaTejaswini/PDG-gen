import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    int m=1000000007;
    long ans=1;
    int i=1;
    while(i<=N) {
      ans=(i*ans) %m;
      i++;
    }
    System.out.println(ans);
    
  }
}