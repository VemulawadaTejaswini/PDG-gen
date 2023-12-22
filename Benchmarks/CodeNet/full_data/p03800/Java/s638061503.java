import java.util.Scanner;

public class Main {

  static String input;
  static char[] output;
  static int length;

  static boolean checkLast() {
    if (output[length - 1] == 'S') {
      return (input.charAt(length - 1) == 'x' && output[length - 2] != output[0])
          || (input.charAt(length - 1) == 'o' && output[length - 2] == output[0]);
    } else {
      return (input.charAt(length - 1) == 'x' && output[length - 2] == output[0])
          || (input.charAt(length - 1) == 'o' && output[length - 2] != output[0]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    input = sc.next();
    output = new char[length];

    output[0] = 'S';
    output[1] = 'S';
    if (input.charAt(0) == 'o') {
      output[length - 1] = 'S';
    } else {
      output[length - 1] = 'W';
    }

    for (int i = 1; i < length - 1; i++) {
      char current = ' ';
      if (output[i] == 'S') {
        if (input.charAt(i) == 'x') {
          current = (output[i - 1] == 'S' ? 'W' : 'S');
        } else {
          current = output[i - 1];
        }
      } else {
        if (input.charAt(i) == 'x') {
          current = output[i - 1];
        } else {
          current = (output[i - 1] == 'S' ? 'W' : 'S');
        }
      }

      if (i == length - 2) {
        if (current != output[i + 1] || !checkLast()) {
          System.out.println(-1);
        } else {
          System.out.println(new String(output));
        }
        break;
      }
      output[i + 1] = current;
    }
  }
}
