import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M[] =new int[N];
    if(N==1){System.out.println("Yes");}else{
    M[0]=sc.nextInt();
    M[1]=sc.nextInt();
    if(M[0]-1>M[1]){System.out.println("No");}
    else{
    int s =1;
    for(int i=2;i<N;i++){
      M[i]=sc.nextInt();
    if((M[i-1]-1>M[i])||(M[i-2]-2>=M[i])){break;}
      s=s+1;}
      if(s==N-1){System.out.println("Yes");}else{System.out.println("No");}
    }}
  }
}