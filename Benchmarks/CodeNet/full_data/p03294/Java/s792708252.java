import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] myArgs = new int[num];
    for (int i = 0;i < myArgs.length;i++) {
      myArgs[i] = sc.nextInt();
    }

    Main logic = new Main();
    String output = logic.exec(myArgs);
    System.out.print(output);
  }

  private String exec(int[] myArgs) {
    long limit = 0;
    for (int i = 0;i < myArgs.length;i++) {
      limit += myArgs[i] - 1;
    }
    return String.valueOf(limit);
  }
}
