import java.util.*;
import java.util.Arrays;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    
    int[] list = new int[N];
    int max = 0;
    for(int i = 0 ; i < N ; i++){
      list[i] = Integer.parseInt(sc.next());
      max += list[i];
    }
    Arrays.sort(list);
   
    int count = 0;
    int X = x;
    for(int i = 0 ; i < N ; i++){
      int candy = list[i];
      if(X - candy >= 0){
        count++;
        X -= candy;
      }
    }
    
    if((max < x) && (list[N-1] != X)){
       count -= 1;
       System.out.println(count);  
    }else{
      System.out.println(count);
    }
  }  
}