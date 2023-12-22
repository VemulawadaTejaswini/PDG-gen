import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] ans=new int[N];
    int cnt =1;
    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      ans[num-1] = cnt++;
    }

    for (int i = 0; i < N; i++) {
      System.out.println(ans[i]);
    }


  }


}
