import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number;
    long count = 0;
    number = Integer.parseInt(sc.next());
    int[] num_hero = new int[number];
    int[] num_monster = new int[number+1];
    for(i = 0; i <= number; i++) num_monster[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number; i++) num_hero[i] = Integer.parseInt(sc.next());
    count += Math.min(num_hero[0], num_monster[0]);
    num_hero[0] -= Math.min(num_hero[0], num_monster[0]);
    for(i = 1; i < number; i++) {
      count += Math.min(num_hero[i] + num_hero[i-1], num_monster[i]);
      num_hero[i] -= Math.max(num_monster[i] - num_hero[i-1], 0);
    }
    count += Math.min(num_hero[number-1], num_monster[number]);
    System.out.println(count);
  }
}
