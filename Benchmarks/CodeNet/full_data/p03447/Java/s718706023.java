import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int money = scanner.nextInt();
    int cake = scanner.nextInt();
    int donut = scanner.nextInt();

    money = money - cake;

    int dNum = money / donut;

    money = money - (donut * dNum);

    System.out.println(money);


  }

}