import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] m = new int[N];
    int sum = X;
    int cnt = 0;
    for(int i=0; i<N; i++){
      m[i] = sc.nextInt();
      sum -= m[i];
      cnt++;
    }
    Arrays.sort(m);
    while(m[0] <= sum){
      sum -= m[0];
      cnt++;
    }
    System.out.println(cnt);
  }
}