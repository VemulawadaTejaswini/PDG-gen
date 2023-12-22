import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    long Ans=0L;
    
    if(N%2==1){
    }else{
      Ans=Ans+(long)Math.floor(N/10);
      for(int i=1;i<=30;i++){
        Ans=Ans+(long)Math.floor((N/10)/Math.pow(5,i));
      }
    }
    
    System.out.println(Ans);
    
  }
}
