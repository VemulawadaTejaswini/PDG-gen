import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    if(n>=1 && n<=9){
      int ans = n*n*n;
      
      System.out.println(ans);
      
    }else{
      System.out.println("数値は1桁で入力してください");
    }
    
  }
  
}