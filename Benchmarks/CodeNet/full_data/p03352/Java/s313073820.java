import java.util.*;
import java.lang.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    double e = 0;
    double max = e;
    for(int i = 2;e <= x;i++){
      for(int j = 1;e <= x;j++){
        e = Math.pow(j,i);
        if(e <= x && max < e){
          max = e;
        }
      }
    }
    int emax = (int)max;
    System.out.println(emax);
  }
}