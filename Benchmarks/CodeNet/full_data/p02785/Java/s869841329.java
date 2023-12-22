import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int numberOfMonsters = scanner.nextInt();
    final int numberOfSpecialMove = scanner.nextInt();
    final List<Integer> hitPoints = new ArrayList<>();
    for (int i = 0; i < numberOfMonsters; i++) {
      hitPoints.add(scanner.nextInt());
    }

    final int numberOfMonstersNeedToAttack = numberOfMonsters - numberOfSpecialMove;
    if (numberOfMonstersNeedToAttack <= 0) {
      System.out.println(0);
    } else {
      Collections.sort(hitPoints);
      long totalOfHitPoints = 0;
      for (int i = 0; i < numberOfMonstersNeedToAttack; i++) {
        totalOfHitPoints += hitPoints.get(i);
      }
      System.out.println(totalOfHitPoints);
    }


  }
}