import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int cnt;
    N=Math.abs(N-K);
    cnt=N;
    while(true){
      if(Math.abs(N-K)<cnt){
        cnt=Math.abs(N-K);
        N=cnt;
      }else{
        break;
      }
    }
    System.out.printf("%d",N);
  }
}