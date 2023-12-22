import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    if (D == 0) {
      if(N == 100){
        System.out.println(N+1);
      } else {
        System.out.println(N);
      }
    } else if (D == 1) {
      if(N == 100){
        System.out.println(N * 100 + 1);
      } else {
        System.out.println(N * 100);
      }
    } else {
      if(N == 100){
        System.out.println(N * 10000 + 1);
      } else {
        System.out.println(N * 10000);
      }
    }
    sc.close();
  }
}