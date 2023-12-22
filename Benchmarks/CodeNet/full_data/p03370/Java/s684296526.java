import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int X = sc.nextInt();
    
    int Max = 0;
    int[] list = new int[N];
    for(int i = 0 ; i < N; i++){
      list[i] = sc.nextInt();
      Max += list[i];
    }
    
    if(Max <= X){
      int Min = list[0];
       for(int i = 0 ; i < N; i++){
            if(list[i] < Min){
              Min = list[i];
            }
       }
      int ans1 = X -Max;
      int ans2 = ans1 / Min;
      
      System.out.println(ans2 + N);  
      
    }else{
      System.out.println("ドーナツを全種類作ることは不可能です");  
    }
    
  }  
}