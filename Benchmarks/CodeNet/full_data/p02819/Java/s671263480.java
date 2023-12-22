import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc= sc.nextInt();
    int a =sc.nextInt();
    int s =0;
    if((a==2)||(a==3)){System.out.println(a);}else{
    for(int j =a;j<100000;j++){
      for(int i=2;i<j;i++){
      int L = a%i;
      if(L==0){break;}
      s = s+1;}
      if(s==j){break;}
    }
      System.out.println( s );
    }
  }
}