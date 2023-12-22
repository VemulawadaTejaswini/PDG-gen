import java.util.Scanner;
2. 
3.class Main {
4.  public static void main(String[] args) {
5.    Scanner scanner = new Scanner(System.in);
6.    int a,b,c;
7.    a = scanner.nextInt();
8.    b = scanner.nextInt();
9.    c = scanner.nextInt();
10. 
11.    if ((a < c) && (b > c)) {   //(1)
12.      System.out.println("Yes");
13.      
14.    }
15. 
16.    else
17.      System.out.println("No");
18.  }
19.}
