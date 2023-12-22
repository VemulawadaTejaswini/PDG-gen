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

      sum += (long) ((long) find(a,n,k)) *((long) find(b,n,k))*((long) find(b,n,k));
    }

    System.out.println(sum);


  }

  static int find(int start, int n, int k){

    int count = 0;
    while(start <= n){
      start += k;
      count += 1;
    }
    return count;
  }
}
