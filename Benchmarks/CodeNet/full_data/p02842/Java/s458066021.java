import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double x = n/1.08;
    int ans = (int) x;
    System.out.println(ans);
    }
  }
