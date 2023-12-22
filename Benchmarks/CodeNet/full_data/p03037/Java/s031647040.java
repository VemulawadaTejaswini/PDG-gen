import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    int M = sc.nextInt();
    // int L[] = new int[M]; 
    // int R[] = new int[M]; 
    int min = sc.nextInt();
    int max = sc.nextInt();
    for(int i = 1; i < M; i++){
      int tmp_min = sc.nextInt();
      int tmp_max = sc.nextInt();
      if(min<=tmp_min){
        min = tmp_min; 
      }
      if(tmp_max<=max){
        max = tmp_max; 
      }
    }
    System.out.println(Math.max((max-min+1),0));    
  
  }
}


