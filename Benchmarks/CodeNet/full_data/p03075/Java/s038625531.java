import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] a = new int[6];
    
    for(int i = 0; i < 6; i++){
      a[i] = Integer.parseInt(br.readLine());
    }
    
    boolean flag = true;
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        if(Math.abs(a[i] - a[j]) > a[5]){
          flag = false;
          break;
        }
      }
    }
    
    if(flag){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}