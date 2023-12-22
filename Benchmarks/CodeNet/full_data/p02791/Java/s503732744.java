import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(N==1){System.out.println(1);}else if(N==2){int T =sc.nextInt();
                                                  if(T==1){System.out.println(1);}
                                                  else{System.out.println(2);};}else{
      int M[] = new int [N];
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();
    if(M[i]==1){break;}}
      int s = 0;
    for(int r=0;r<N;r++){
      if(M[r]==2){s=s+r;}
      else{s=s;}}
      int l=s;
      for(int q=0;q<s;q++){
      if(M[q]==3){l=q;}
      else{l=l;}}
    int x=0;
    int L=M[0];
    for(int j=0;j<l;j++){
      for(int k=1;k<=j;k++){
         L= Math.min(L,M[k]);}
      if(L==M[j]){
        x=x+1;}
      else{
        x = x;};}
      if(s==N){System.out.println(x);}else if(s==l){System.out.println(x+2);}else{System.out.println(x+3);}
    }
  }
}
