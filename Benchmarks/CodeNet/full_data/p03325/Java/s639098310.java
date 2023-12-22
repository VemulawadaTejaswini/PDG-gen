import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    long[] list = new long[number];
    for(int i = 0; i < number; ++i){
      list[i] = sc.nextLong();
    }
    
   int count = 0;
    
    for(int i = 0; i < number; ++i){
      while(list[i] % 2 == 0){
        list[i] = list[i] / 2;
        count++;
      }
    }
    
    System.out.println(count);
    
  }
}