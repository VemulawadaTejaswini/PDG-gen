import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    String M =sc.next();
    String m[] =M.split("",0);
    int n[][] =new int[N][N];
    int x[]=new int[N];
    int y[]=new int[N];
    for(int k=0;k<N;k++){
      n[0][k]=Integer.parseInt(m[k]);
    x[k]=0;}
    for(int i=1;i<N;i++){
      for(int j=0;j<N-i;j++){
        if(j>N-y[i]-i){continue;}else{
        if(n[i-1][j]==n[i-1][j+1]){x[i]=x[i]+1;
                                  if(x[i]==N-y[i]-i){System.out.println(0);System.exit(0);}}
        else{n[i][j-x[i]]=Math.abs(n[i-1][j]-n[i-1][j+1]);}
        y[i]=x[i]+y[i-1];
      }}
    }
    System.out.println(n[N-1][0]);
  }
}