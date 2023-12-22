import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int win = sc.nextInt();
    int cur = sc.nextInt();
    
    if (win < cur*2) {
      System.out.println(0);
    }else{
      System.out.println(win-cur*2);
    }
  }
}
      