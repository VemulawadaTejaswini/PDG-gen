import java.io.*;
import java.util.*;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next()); //桁数
    
    int[] keta = new int[n]; //桁の数
    
    int sum = 0;
    
    for(int i = 0;i < n;i++){
      keta[i] = 10;
    }
    
    int m = Integer.parseInt(scan.next()); //整数
    
    if(m != 0){
    
    for(int i = 0;i < m;i++){ 
      int s = Integer.parseInt(scan.next());
      
      int num = Integer.parseInt(scan.next());
      
      if(num < keta[s-1]){
        keta[s-1] = num;
      }
    }
    /*
    for(int i = 0;i < n;i++){
      System.out.println(keta[i]);
    }
    */
    
    if(keta[0] == 10 || keta[0] == 0){
      System.out.println(-1);
    }
    
    else{
      for(int i = 0;i < n;i++){
        if(keta[i] == 10){
          keta[i] = 0;
        }
        sum += keta[i]*(Math.pow(10, (n-1) - i));
      }
      System.out.println(sum);
    }
    }
    else{
      keta[0] = 1;for(int i = 0;i < n;i++){
        if(keta[i] == 10){
          keta[i] = 0;
        }
        sum += keta[i]*(Math.pow(10, (n-1) - i));
      }
      System.out.println(sum);
    }
      
      
  }
}