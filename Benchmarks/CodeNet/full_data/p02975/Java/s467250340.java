import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, temp, i, j;
    number = Integer.parseInt(sc.next());
    int[] num = new int[number];
    temp = num[0];
    for(i = 0; i < number; i++) {
      num[i] = Integer.parseInt(sc.next());
    }
    for(i = 1; i < number; i++) {
      temp ^= num[i];
      for(j = 1; j < number; j++) {
        if(i = j) continue;
        temp ^= num[j];
      }
      if(temp == num[0]) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
