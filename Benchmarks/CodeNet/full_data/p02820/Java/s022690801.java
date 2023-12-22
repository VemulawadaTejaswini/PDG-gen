import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    long sum = 0;
    String way = "";
    String t = sc.next();
    int i=0;

    for (; i < k; i++) {
      char c = t.charAt(i);
      switch (c) {
      case 'r':
        sum += p;
        way += 'p';
        break;

      case 's':
        sum += r;
        way += 'r';
        break;

      case 'p':
        sum += s;
        way += 's';
        break;
      }
    }

    for (; i + k < n; i++) {
      char c = t.charAt(i);
      switch (c) {
      case 'r':
        if (way.charAt(i - k) == 'p') {
          way += getWay(t, i + k, 'p');
        } else {
          sum += p;
          way += 'p';
        }
        break;

      case 's':
        if (way.charAt(i - k) == 'r') {
          way += getWay(t, i + k, 'r');
        } else {
          sum += r;
          way += 'r';
        }
        break;

      case 'p':
        if (way.charAt(i - k) == 's') {
          way += getWay(t, i + k, 's');
        } else {
          sum += s;
          way += 's';
        }
        break;
      }
    }

    for (; i < n; i++) {
      char c = t.charAt(i);
      switch (c) {
      case 'r':
        if (way.charAt(i - k) != 'p') {
          sum += p;
        }
        break;

      case 's':
        if (way.charAt(i - k) != 'r') {
          sum += r;
        }
        break;

      case 'p':
        if (way.charAt(i - k) != 's') {
          sum += s;
        }
        break;
      }
    }

    System.out.println(sum);

  }

  public static char getWay(String t, int index, char ban) {
    char c = t.charAt(index);
    char ret = 0;
    switch (c) {
    case 'r':
      if (ban == 'r') {
        ret = 's';
      } else {
        ret = 'r';
      }
      break;
    case 's':
      if (ban == 's') {
        ret = 'p';
      } else {
        ret = 's';
      }
      break;
    case 'p':
      if (ban == 'p') {
        ret = 'r';
      } else {
        ret = 'p';
      }
      break;
    }

    return ret;
  }

}