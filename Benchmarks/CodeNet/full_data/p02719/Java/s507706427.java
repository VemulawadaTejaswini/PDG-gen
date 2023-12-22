import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int min1=0;
    int min2=0;
    for(int i=0;;i++){
      if(N-K*i>0) min1=N-K*i;
      else{
        min2=K*i-N;
        break;
      }
    }
      if(min1<=min2) System.out.println(min1);
      else System.out.println(min2);
      
  }
}