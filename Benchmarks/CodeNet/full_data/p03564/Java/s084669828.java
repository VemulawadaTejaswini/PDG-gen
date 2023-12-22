import java.util.Scanner;
public class Main {
  int count = 1;
  public static void main(String[] args) {
    new Main().run();
  }
  public void run() {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    for(int i = 0; i < N; i++){
      if(count < K) {
        count *= 2;
      }else {
        count += K;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
