import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
  
   	String x = scanner.nextLine();
    int numx = Integer.parseInt(x);
    String[] array = x.split("");
    
    int sum = 0;
    
    for (int i=0; i<x.length(); i++){
      int temp = Integer.parseInt(array[i]);
      sum += temp;
    }
    
    if (numx%sum == 0){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}