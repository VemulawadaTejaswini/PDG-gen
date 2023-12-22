import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    int[] min1 = {x, 2*x};
    int[] min2 = {y, 2*y};
    int sum1 = 500000000;
    int sum2 = 500000000;

    for(int i = 0; i <= x; i++){
      for(int j = 0; j <= 2*x; j++){
        if((a*i + c*j) < sum1 && i+(j/2) >=x){
          min1[0] = i;
          min1[1] = j;
          sum1 = a*i + c*j;
        }
      }
    }

    for(int i = 0; i <= y; i++){
      for(int j = 0; j <= 2*y; j++){
        if((b*i + c*j) < sum2 && i+(j/2) >=y){
          min2[0] = i;
          min2[1] = j;
          sum2 = b*i + c*j;
        }
      }
    }

    if(sum1+b*(y-min1[1]/2) > sum2+a*(x-min2[1]/2)){
      System.out.println(sum2+a*(x-min2[1]/2));
    }else{
      System.out.println(sum1+b*(y-min1[1]/2));
    }

  }
}
