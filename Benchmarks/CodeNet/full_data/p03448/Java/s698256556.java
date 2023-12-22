import java.util.Scanner;

public class Main {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt(); // 500
    int B = sc.nextInt(); // 100
    int C = sc.nextInt(); // 50
    int X = sc.nextInt(); // sum
    int rc = 0;           // result count
    
    for (int a =0;a<=A;a++) {
      for (int b =0;b<=B;b++) {
        for (int c =0;c<=C;c++) {
          if (X == 500*a+100*b+50*c) {
            rc = rc +1;
          }
        }
      }
    }
    System.out.println(rc);
  }
}