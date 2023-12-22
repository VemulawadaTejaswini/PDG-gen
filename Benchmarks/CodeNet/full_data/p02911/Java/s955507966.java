import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int a[] = new int [N];
    
    for (int i=0; i<Q; i++){
      int b = sc.nextInt();
      a[b-1]++;
    }
    for (int i=0; i<N;i++) {
      if(K - (Q - a[i]) > 0) {
        System.out.println("Yes");
      }else {
        System.out.println("No");
      }
    }
  }
}