import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long money , goen ,gohyaku;
    money = sc.nextInt();
    goen = (money % 500) / 5 * 5;
    gohyaku = (money / 500) *1000;
    System.out.println(goen + gohyaku);
  }
}
