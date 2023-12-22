import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 0;
    int cnt = 1;
    while(cnt<=n){
      a = sc.nextInt();
      if(cnt!=a){
        b++;
      }
      cnt++;
    }    
    if(b==2||b==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  } 
}