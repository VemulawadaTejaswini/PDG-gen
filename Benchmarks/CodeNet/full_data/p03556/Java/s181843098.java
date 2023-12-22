import java.util.*;

class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    for(int i=n; i>0; i--){
      double ans = Math.sqrt(i);
      if((ans-(int)Math.sqrt(i))==0){
        System.out.println(i);
        break;
      }
    }
  }
}