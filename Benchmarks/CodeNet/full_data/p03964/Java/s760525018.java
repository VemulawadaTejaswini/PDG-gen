import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[][] x = new long[N][2];
    boolean hantei = true;

    for (int i = 0; i < N ; i++) {
      x[i][0] = sc.nextInt();
      x[i][1] = sc.nextInt();
    }
     
    for(int i = 1; i < N ; i++){
      hantei = true;
//      System.out.print(i);
      long a = x[i][0];
      long b = x[i][1];

      while(hantei){

        if( x[i][0] < x[i - 1][0] || x[i][1] < x[i - 1][1]){
          x[i][0] = x[i][0] + a;
          x[i][1] = x[i][1] + b;
//          System.out.print(x[i][0]);
//          System.out.println(x[i][1]);
        }

        else {
          hantei = false;
        }

      }

    }

    System.out.println(x[N-1][0] + x[N-1][1]);
  }
}