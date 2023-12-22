import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int C =sc.nextInt();
    int D;
    if(C==0){System.out.println("YES");}
    else{
      for(int i=1;i<B;i++){
        D = (A*i)%B;
        if(D==C){System.out.println("YES");System.exit(0);}
      }
      System.out.println("NO");
    }
  }
}