import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
       
    int tax_8 = Integer.parseInt(scan.next()); //整数    8
    int tax_10 = Integer.parseInt(scan.next()); //整数　　10
    
    ArrayList<Integer> array_8 = new ArrayList<>();
    ArrayList<Integer> array_10 = new ArrayList<>();
    
    int ans = -1;
    
    for(int i = 0; i < 1250; i++){
      if(Math.floor(i * 0.08) == tax_8){
        array_8.add(i);
      }
    }
    
    for(int i = 0; i < 1000; i++){
      if(Math.floor(i * 0.1) == tax_10){
        array_10.add(i);
      }
    }
 
    loop:
    for(int i = 0; i <array_8.size(); i++){
      for(int j = 0; j <array_10.size(); j++){
        if(array_8.get(i) == array_10.get(j)){
          ans = array_8.get(i);
          break loop; 
        }
      }
    }
    System.out.println(ans);
  }
}