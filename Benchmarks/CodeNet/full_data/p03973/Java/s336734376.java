import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    main4();
  }

  private static void main1() {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    String seikai = "CODEFESTIVAL2016";
    int count = 0;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) != seikai.charAt(i))
        count++;
    }
    System.out.println(count);
    scanner.close();
  }

  private static void main2() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    String s = scanner.next();
    int all = 0;
    int overSea = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        if (all < (a + b)) {
          System.out.println("Yes");
          all++;
        } else
          System.out.println("No");
      } else if (s.charAt(i) == 'b') {
        if ((all < (a + b)) && overSea < b) {
          System.out.println("Yes");
          all++;
          overSea++;
        } else
          System.out.println("No");
      } else {
        System.out.println("No");
      }

    }
    scanner.close();
  }

  private static void main3() {
    Scanner scanner = new Scanner(System.in);
    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int[] p = new int[w];
    int[] q = new int[h];
    for (int i = 0; i < w; i++)
      p[i] = scanner.nextInt();
    for (int i = 0; i < h; i++)
      q[i] = scanner.nextInt();
    int[] cost = new int[(w + 1) * (h + 1)];
    List<Integer> notFin = new ArrayList<>();
    for (int i = 0; i < cost.length; i++)
      notFin.add(i);
    for (int i = 0; i < cost.length; i++)
      cost[i] = Integer.MAX_VALUE;
    cost[0] = 0;
    notFin.remove(Integer.valueOf(0));
    int pre = 0;
    // index = y * w + x;
    int w1 = w + 1;
    int h1 = h + 1;
    List<Integer> usedP = new ArrayList<>();
    List<Integer> usedQ = new ArrayList<>();
    String[] useRoad = new String[cost.length];
    Set<String> used = new HashSet<>();
    while (!notFin.isEmpty()) {
      int x = pre % w1;
      int y = pre / w1;
      if (isIn(x + 1, y, w1, h1)) {
        int c = cost[pre] + p[x];
        int index = toIndex(x + 1, y, w1);
        if (cost[index] > c) {
          cost[index] = c;
          useRoad[index] = "p" + x + "," + y;
        }
      }
      if (isIn(x - 1, y, w1, h1)) {
        int c = cost[pre] + p[x - 1];
        int index = toIndex(x - 1, y, w1);
        if (cost[index] > c) {
          cost[index] = c;
          useRoad[index] = "p" + (x - 1) + "," + y;
        }
      }
      if (isIn(x, y + 1, w1, h1)) {
        int c = cost[pre] + q[y];
        int index = toIndex(x, y + 1, w1);
        if (cost[index] > c) {
          cost[index] = c;
          useRoad[index] = "q" + y + "," + x;
        }
      }
      if (isIn(x, y - 1, w1, h1)) {
        int c = cost[pre] + q[y - 1];
        int index = toIndex(x, y - 1, w1);
        if (cost[index] > c) {
          cost[index] = c;
          useRoad[index] = "q" + (y - 1) + "," + x;
        }
      }
      int minIndex = notFin.get(0);
      for (Integer i : notFin)
        if (cost[i] < cost[minIndex])
          minIndex = i;
      used.add(useRoad[minIndex]);
      notFin.remove(Integer.valueOf(minIndex));
      pre = minIndex;
    }
    int allCost = 0;
    for (String u : used) {
      System.err.println(u);
      u = u.split(",")[0];
      if (u.charAt(0) == 'p')
        allCost += p[Integer.valueOf(u.substring(1))];
      else
        allCost += q[Integer.valueOf(u.substring(1))];
    }
    System.out.println(allCost);
    scanner.close();
  }

  private static int toIndex(int x, int y, int w) {
    return y * w + x;
  }

  private static boolean isIn(int x, int y, int w, int h) {
    return x >= 0 && x < w && y >= 0 && y < h;
  }

  private static void main4() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> a = new ArrayList<>();
    for (int i = 0; i < n; i++)
      a.add(scanner.nextInt());
    int cout = 0;
    while (true) {
      Integer max = Collections.max(a);
      int maxIndex = a.indexOf(max);
      int secondIndex = 0;
      while (maxIndex != 0) {
        for (int i = 0; i < maxIndex - 1; i++)
          if (a.get(i) < a.get(secondIndex))
            secondIndex = i;
        if (max - a.get(secondIndex) != 1)
          break;
        max = a.get(secondIndex);
        maxIndex = a.indexOf(max);
        secondIndex = 0;
      }
      if (maxIndex == 0) {
        int m = Collections.max(a.subList(1, a.size()));
        int hiku = max - m + 1;
        a.set(0, max - hiku);
        cout += hiku;
        break;
      } else {
        a.set(maxIndex, max - (a.get(secondIndex) + 1));
        cout++;
      }
    }
    System.out.println(cout);
    scanner.close();
  }

  private static void main5() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<String> s = new ArrayList<>();
    for (int i = 0; i < n; i++)
      s.add(scanner.next());
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      List<String> cp = new ArrayList<>(s);
      int rank = 0;
      String target = s.get(scanner.nextInt());
      List<Character> rule = new ArrayList<>();
      for (char c : scanner.next().toCharArray())
        rule.add(c);
    }
    scanner.close();
  }

}