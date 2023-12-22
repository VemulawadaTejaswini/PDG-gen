import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int min=1;
    int max=100000000;
    
    for(int i=0; i < N; i++){
      int A = sc.nextInt();
      min = Math.min(min, A);
      max = Math.max(max, A);
     
    }
    System.out.println(Math.abs(max-min));
  }
}