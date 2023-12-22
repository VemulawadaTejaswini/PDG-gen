import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, temp, i, j;
    number = Integer.parseInt(sc.next());
    int[] num = new int[number];
    temp = 0;
    for(i = 0; i < number; i++) {
      num[i] = Integer.parseInt(sc.next());
      temp ^= num[i];
    }
    for(i = 0; i < number; i++) {
      if(temp == num[i]) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
