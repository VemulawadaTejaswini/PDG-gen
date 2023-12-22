import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M[] =new int[N];
    if(N==1){System.out.println("Yes");}else{
    M[0]=sc.nextInt();
    int s =0;
    for(int i=1;i<N;i++){
      M[i]=sc.nextInt();
      int L =M[0];
      L = Math.max(L,M[i]);
      if(L-1>M[i]){break;}
      s=s+1;}
      if(s==N-1){System.out.println("Yes");}else{System.out.println("No");}
    }
  }
}