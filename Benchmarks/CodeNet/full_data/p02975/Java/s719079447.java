import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), zero = 0, one = 0;
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      if(sc.nextInt() % 2 == 0){
          zero++;
      } else {
          one++;
      }
    }
    if(zero - one <=1 && one - zero <= 1){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
  }
}