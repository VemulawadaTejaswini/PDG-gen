import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int health = sc.nextInt();
    int attacks = sc.nextInt();

    int totalAttack = 0;

    for (int i = 0; i < attacks; i++) {
      totalAttack += sc.nextInt();
    }
    if (health > totalAttack)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}