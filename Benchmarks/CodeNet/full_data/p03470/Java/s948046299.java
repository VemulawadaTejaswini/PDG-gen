import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[] count = new int[number];
    int[] data = new int[110];
    for (int i = 0; i < number; i++) {
      count[i] = sc.nextInt();
    }
    for (int i = 0; i < number; i++) {
      data[count[i]]++;
    }
    int answer = 0;
    for (int i = 1; i <= 100; i++) {
      if (data[i] > 0) {
        answer++;
      }
    }
    System.out.println(answer);
                          
  }
}