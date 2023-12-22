import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int all = (int)Math.pow(3,n);
    
    int count = 0;

    for(int i = 0 ; i < n ; ++i){
      int a = sc.nextInt();
      
      if(a%2==0){
        count++;
      }
         
    }
    int num = (int)Math.pow(2,count);
    
    System.out.println(all-num);
    
  }
}