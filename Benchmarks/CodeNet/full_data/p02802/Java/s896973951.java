import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    if(M==0){System.out.println(0+" "+0);}
    else{
    int O[] =new int [M];
    String P[]=new String[M];
      int x=0; int y=0;
    for(int i=0;i<M;i++){
      O[i]=sc.nextInt();
      P[i]=sc.next();}
    for(int j=1;j<=N;j++){
      loop:for(int k=0;k<M;k++){
        if(O[k]==j){
          if(P[k].equals("AC")){x=x+1;break loop;}
          else{y=y+1;}}}}
      System.out.println(x+" "+y);
    }
  }
}