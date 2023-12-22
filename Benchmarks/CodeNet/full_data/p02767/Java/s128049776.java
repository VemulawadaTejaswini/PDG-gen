import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    double t = 0;
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      t += X[i]; 
    }
    int ave = (int)Math.round(t/N);
    int n = 0;    
    for (int i = 0; i < N; i++) {
      n += Math.pow(ave-X[i],2); 
    }
    System.out.println(n);
  }
}