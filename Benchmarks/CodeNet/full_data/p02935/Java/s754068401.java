import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    for(i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    Arrays.sort(b);
    double c = (double)(b[0] + b[1]) / 2;
    for(j = 2; j < b.length; j++){
      c = (double)(tmp + b[j]) / 2;
    }
    System.out.println(c);
  }
}