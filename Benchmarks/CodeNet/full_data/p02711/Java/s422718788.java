import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag = false;
    int a = n/100;
    int b = n&100;
    b /= 10;
    int c = n%10;
    System.out.println(a==7||b==7||c==7?"Yes":"No");
  }
}