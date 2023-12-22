import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    int N = Integer.parseInt(scan.next()); //整数    
    int A = Integer.parseInt(scan.next()); //整数    蒼
    int B = Integer.parseInt(scan.next()); //整数　　赤
    
    if(A == 0 && B == 0){
      System.out.println(0);
    }
    
    else{
      
      ArrayList<String> array = new ArrayList<>();
      
      int dekai = (int)Math.pow(10, 100);
      
      for(int i = 0;i < dekai;i++){
      
        for(int j = 0;j < A;j++){ 
          array.add("b");
        }
        for(int j = 0;j < B;j++){ 
          array.add("r");
        }
        if(array.size() > N){
          break;
        }
      }
      int count_b = 0; //青の数
      for(int i = 0;i < N;i++){ 
          if(array.get(i) == "b"){
            count_b++;
        }
      }
      System.out.println(count_b);
      }
  }
}
