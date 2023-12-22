import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H[] = new int[N];
    for(int i=0; i < N; i++) H[i] = sc.nextInt();
    int ans = H[0] + H[N-1];
    for(int i=1; i<N; i++)
      ans += Math.abs(H[i-1]-H[i]);
    System.out.println(ans/2);
  }
}