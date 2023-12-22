import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] data = new int[n+1];
    int total_apple = 0;
    int except_apple = 0;
    int apple = 0;
    int apple_i = 0;
    int answer = 0;
    int j = 1;

    for(int i = 1;i <= n;i++) {
      data[i] = l + i - 1;
      total_apple += data[i];
    }

    except_apple = total_apple - data[1];
    apple = Math.abs(total_apple - except_apple);

    for(int i = 1;i <= n;i++) {

      except_apple = total_apple - data[i];
      apple_i = Math.abs(total_apple - except_apple);

      if(apple > apple_i) {
        apple = apple_i;
        j = i;
      }

    }

    answer = total_apple - data[j];

    System.out.println(answer);

  }

}
