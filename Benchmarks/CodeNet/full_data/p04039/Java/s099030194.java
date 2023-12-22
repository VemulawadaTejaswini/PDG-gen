import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    boolean D[] = new boolean[10];
    for (int i = 0; i < K; i++) {
      D[scan.nextInt()] = true;
    }
 
    int answer = 0;
    boolean isUp = false;
    for (int i = 0; i < 4; i++) {
      int index = N % (int)Math.pow(10, i + 1) / (int)Math.pow(10, i);
      if (isUp) {
        isUp = false;
        index++;
        if (index > 9) {
          index = 0;
          isUp = true;
        }
      }
      while (true) {
        if (!D[index]) {
          answer += Math.pow(10, i) * index;
          break;
        }
        index++;
        if (index > 9) {
          index = 0;
          isUp = true;
        }
      }
    }
    System.out.println(answer);
  }
}