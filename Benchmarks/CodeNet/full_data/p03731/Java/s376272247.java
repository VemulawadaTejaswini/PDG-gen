import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long T = sc.nextLong();
    long[] t = new long[n];
    for(int i = 0; i < n; i++){
      t[i] = sc.nextLong();
    }
    long sum = T * n;
    long tmp = T;
    for(int i = 1; i < n; i++){
      sum -= (tmp > t[i]) ? (tmp - t[i]) : 0;
      tmp = t[i] + T;
    }
    System.out.println(sum);
  }
}