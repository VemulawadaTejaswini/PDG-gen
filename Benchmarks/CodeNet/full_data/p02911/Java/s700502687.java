import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();

    int[] nums = new int[N];

    for (int i = 0; i < Q; i++) {
      int n = sc.nextInt();
      nums[n-1]++;
    }

    for (int i = 0; i < N; i++) {
      int n = nums[i];
      if(n + K-Q >0 ){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
    }

}