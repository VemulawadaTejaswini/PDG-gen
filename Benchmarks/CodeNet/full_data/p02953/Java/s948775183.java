import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M[] =new int[N];
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();}
   int L =M[N-1]+1;
    for(int j=0;j<N;j++){
      L = Math.max(L,M[N-j]);
      if(L==M[N-j]){System.out.println("No");}
    }
    System.out.println("Yes");
  }
}
