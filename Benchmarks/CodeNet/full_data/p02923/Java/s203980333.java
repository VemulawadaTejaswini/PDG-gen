import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, tmp, number, count = 0, answer = 0;
    number = Integer.parseInt(sc.next());
    int[] height = new int[number];
    for(i = 0; i < number; i++) height[i] = Integer.parseInt(sc.next());
    tmp = height[0];
    for(i = 1; i < number; i++) {
      if(answer < count) answer = count;
      if(tmp >= height[i]) {
        count++;
      } else {
        count = 0;
      }
      tmp = height[i];
    }
    if(answer < count) answer = count;
    System.out.println(answer);
  }
}
