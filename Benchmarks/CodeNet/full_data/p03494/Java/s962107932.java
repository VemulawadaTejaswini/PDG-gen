package main.abc081_b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      numbers.add(scanner.nextInt());
    }

    int count = 0;


    List<Integer> numbers2 = new ArrayList<>();

    while (true) {

      List<Integer> nextNumbers = new ArrayList<>();

      boolean allEven = numbers.stream().allMatch(number -> {
        nextNumbers.add(number / 2);
        return number % 2 == 0;
      });

      if (allEven) {
        count++;

        numbers = nextNumbers;
      } else {
        break;
      }
    }

    System.out.println(count);
  }
}
