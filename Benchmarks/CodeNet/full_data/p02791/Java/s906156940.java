import java.util.*;
 
public class Main {
 
  public static void main(String args[]) {
   
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] data = new int[length];
    for (int a=0; a<length; a++) {
       data[a] = sc.nextInt();
    }
   
    int count = 0;
    int i = 0;
    int min = data[0];
    
    for (int b=0; b<length; b++) {
      i = data[b];
      
      if (min >= i) {
        count++;
        min = i;
      }
    }
    
    System.out.println(count);
   
 
    
  }
}