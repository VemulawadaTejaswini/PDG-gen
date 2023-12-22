import java.util.Scanner;
import java.lang.Math;
public class Main{
  
  public static int r1(int n, int x){
    int count = 0;
    while(true){
      n /= x;
      if(n == 0)
        break;
      count++;
    }
    return count;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] sisu = {9, 6, 1};
    int j = 0;
    while(n != 0){
      if(r1(n, 9) == 0)
        j = 1;
      if(r1(n, 6) == 0)
        j = 2;
      n -= Math.pow(sisu[j], r1(n, sisu[j]));
      count++;
    }
    System.out.println(count);
  }
}