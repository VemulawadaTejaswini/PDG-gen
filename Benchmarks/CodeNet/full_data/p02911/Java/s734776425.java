
import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int q = scan.nextInt();
    int[] points = new int[n];
    for(int i = 0; i < n; i++){
      points[i] = 0;
    }
    for(int i = 0; i < q; i++){
      int iNum = scan.nextInt() - 1;
      points[iNum] += 1;
    }

    for(int i = 0; i < n; i++){
      int sum = k - q + points[i];
      if(sum <= 0){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }

  }
}
