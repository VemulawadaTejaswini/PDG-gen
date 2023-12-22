import java.util.Scanner;

class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int peopleCount = sc.nextInt();
    int day = sc.nextInt();
    int restChocolate = sc.nextInt();
    int[] interval = new int[peopleCount];
    int eatedChocolate = 0;
    for (int i=0; i<peopleCount; i++) {
      interval[i] = sc.nextInt();
    }

    for (int i=0; i<peopleCount; i++) {
      eatedChocolate += (day-1)/interval[i] + 1;
    }
    System.out.println(eatedChocolate + restChocolate);
  }
}
