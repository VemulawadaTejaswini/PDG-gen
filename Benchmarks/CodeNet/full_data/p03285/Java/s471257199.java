import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N=sc.nextInt();
    bool buyflg=false;
    
    for(int a=0; a<=N; a+7){
      
	  for((int b=0; b<=N; b+4){
        if(a*7+b*4==N){
          buyflg=true;
          break;
        }
      }
      if(buyflg==true){
        break;        
      }
    }
  }
}