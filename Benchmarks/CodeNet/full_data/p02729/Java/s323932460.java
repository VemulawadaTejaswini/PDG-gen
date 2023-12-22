import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    int m;
    n = sc.nextInt();
    m = sc.nextInt();
    System.out.println(n*(n-1)/2 + m*(m-1)/2);
  }
}
