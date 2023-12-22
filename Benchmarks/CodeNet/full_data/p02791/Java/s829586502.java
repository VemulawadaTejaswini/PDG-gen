import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
      int M[] = new int [N];
    int s =0;
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();
     s = s+1;
    if(M[i]==1){break;}}
    int x=0;
    int L=M[0];
    for(int j=0;j<s;j++){
      for(int k=1;k<=j;k++){
         L= Math.min(L,M[k]);}
      if(L==M[j]){
        x=x+1;}
      else{
        x = x;};}
    System.out.println(x);
  }
}