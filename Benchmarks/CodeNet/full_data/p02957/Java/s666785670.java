import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int AA =0;
    int BB =0;

    int A = sc.nextInt();
    int B = sc.nextInt();

    int  max = Math.max(A,B);

    for(int k = 0 ;k<max;k++){
        AA = Math.abs(A-k);
        BB = Math.abs(B-k);

        if(AA==BB){
          System.out.println(k);
          System.exit(0);
        }
    }
    System.out.println("IMPOSSIBLE");
  }
}