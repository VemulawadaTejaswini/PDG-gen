import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int X =sc.nextInt();
    int Y =sc.nextInt();
    int Z =(Y-X+1)/2;
    int W[] =new int[N];
    for(int i=0;i<N;i++){W[i]=0;}
    for(int k=1;k<=N-1;k++){
      if(k<=X-1){W[k]=W[k]+X-k;}
      if(k<=N-Y){W[k]=W[k]+N-Y-k+1;}
      if(k<=Z){W[k]=W[k]+Y-X+1;}
      if((k>=X)&&(k<=Z+X-1)){W[k]=W[k]+2;} 
      if((k>=N-Y+1)&&(k<=Z+N-Y)){W[k]=W[k]+2;} 
      if(k==N-Y+X){W[k]=W[k]+1;}
      System.out.println(W[k]);}
  }
}