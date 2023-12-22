import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N=sc.nextLong();
    String M =sc.next();
    String m[] =M.split("",0);
    long n[][] =new long[N][N];
    for(int k=0;k<N;k++){
      n[0][k]=Integer.parseInt(m[k]);}
    for(int i=1;i<N;i++){
      for(int j=0;j<N-i;j++){
        n[i][j]=Math.abs(n[i-1][j]-n[i-1][j+1]);
      }
    }
    System.out.println(n[N-1][0]);
  }
}
