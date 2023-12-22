import java.util.*;

public class Main{
  
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  int[] list = new int[n];
 
  for(int i = 0; i < n ; i++){
    list[i] = sc.nextInt();
  }
  
  int count = 0;
  for(int i = 0; i < n - 2; i++){
    if(list[i] < list[i+1] && list[i+1] < list[i+2]){
      count++;
    }else if(list[i] > list[i+1] && list[i+1] > list[i+2]){
      count++;
    }
   }
     System.out.println(count);
   }
}
