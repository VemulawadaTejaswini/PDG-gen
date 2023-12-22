import java.util.Scanner;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Main{
  
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n;
    n = sc.nextInt();
    
    int[] nums = new int[n];
    boolean another_max = false;
    int max = 0;
    int max2 = 0;
    boolean second = true;
    for (int i=0; i!=n; i+=1){
      int num = sc.nextInt();
      nums[i] = num;
      if (i == 0) {
        max = num;
      }
      else if (i == 1){
        if (num < max){
          max2 = num;
        }
        else{
          max2 = max;
          max = num;
        }
      }
      else{
      if (num == max) another_max = true;
      
      if (num != max){
        if (num > max){
          max2 = max;
          max = num;
          another_max = false;
        }
        else if (num < max && num > max2){
          max2 = num;
        }
      }
      }
    }
    
    if (max2 == 0) max2 = max;
//    System.out.print(max + " " + max2 + " "+ another_max);
    StringBuilder sb = new StringBuilder();
    for (int i=0; i!=n; i+=1){
      if (nums[i] == max && !another_max) sb.append(max2 + "\n");
      else sb.append(max + "\n");
    }
    
    
    
    
    
    System.out.print(sb.toString());
    
    
  }
}