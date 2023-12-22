import java.util.*;
class main{
  public static void main (string [] args){
    Scanner stdIn = new Scanner(System.in);
    int M = stdIn.nextInt();
    int D = stdIn.nextInt();
    int d1; int d10;
    int count;
    for(int i=1;i<=M;i++){
      for(int j=1;j<=D;j++){
        d1=j%10; d10=j/10;
        if(d1>=2&&d10>=2) 
          if(d1*d10==i) count++;
      }
    }
    System.out.println(count);
    
  }
  
  
  
  
}