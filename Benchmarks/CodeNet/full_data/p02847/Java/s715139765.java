import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String P =sc.next();
    String M[] ={"A","F","H","W","TU","M","SU"};
    for(int i=0;i<7;i++){
      if(P.contains(M[i])){System.out.println(i+1);}
    }
  }
}
