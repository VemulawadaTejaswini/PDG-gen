import java.util.Scanner;

public class Main{
3.  public static void main(String[] args){
4.    Scanner sc = new Scanner(System.in);
5.    int n = sc.nextInt();
6.    int x = 800 * n;
7.    int y = 200 * (n/25);
8.    System.out.println(x-y);
9.  }
10.}
