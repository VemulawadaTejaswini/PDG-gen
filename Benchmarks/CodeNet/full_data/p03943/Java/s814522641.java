import java.util.*;
import java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num[] = new int[3];
    int max = 0;
    int sum = 0;
    int remain = 0;
    for(int i=0;i<3;i++){
      num[i] = sc.nextInt(); 
      sum += num[i];
    }
    max = Math.max(num[0],num[1],num[2]);
    remain = sum - max;
    if(max == remain){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}