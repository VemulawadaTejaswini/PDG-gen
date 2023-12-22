import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    long sum = 0;
    for (int i=1;i<=k;i++){
      int a = i;
      int b = k-i;
      if ((((2*b) % k) != 0) || (b > n) || (b < 0)){
        continue;
      }
      if (b == 0){
        b = a;
      }
      
      sum += find(a,n,k)*find(b,n,k)*find(b,n,k);
    }
    System.out.println(sum);


  }

  static int find(int start, int n, int k){
    if (start == 0){
      start = k;
    }
    int count = 0;
    while(start <= n){
      start += k;
      count += 1;
    }
    return count;
  }
}
