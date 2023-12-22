import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] s = new int[N];
    int sum = 0;
    int tmp = 0;
    for (int i = 0; i< N; i++){
      s[i] = scanner.nextInt();
    }
    Arrays.sort(s);
    for (int i = 0; i < N; i++){
      sum += s[i];
    }
    tmp = sum;
    for (int i = 0; i < N; i++){
      if (sum % 10 != 0){
        break;
      } else if (sum % 10 == 0){
        sum = tmp;
        sum -= s[i];
      }
    }
    System.out.println(sum);
  }
}
