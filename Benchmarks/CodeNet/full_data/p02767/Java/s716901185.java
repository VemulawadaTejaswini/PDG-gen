import java.io.*;
import java.util.*;

class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next()); //整数
    
    int[] address = new int[n]; //座標入れる配列
    
    int sum = 0;
    int ave = 0;
    int cost = 0;
    
    for(int i = 0;i < n;i++){
      address[i] = Integer.parseInt(scan.next());
      
      sum = sum + address[i];
    }    
    ave = Math.round(sum / n);
    
    if(sum % n >= 5){
      ave++;
    }
    
    for(int i = 0;i < n;i++){
      cost = cost + (int)Math.pow(address[i]-ave,2);
    }
    
    System.out.println(cost);
  }
}