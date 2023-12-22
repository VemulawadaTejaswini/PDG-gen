import java.util.Scanner;

public class main{
public static void main(){
  int N=0;
  int Max=0;
  Scanner s=new Scanner(System.in);
  int all=0; 
  int P[]=new int[N];
  P={0};

  N=s.nextInt();

  for(int i=0;i<N;i++){
   P[i]=s.nextInt();
   all+=P[i];

    if(Max<P[i]){
     Max=save;
   }

  }
 all-=Max;
 all+=Max/2;
 }
}