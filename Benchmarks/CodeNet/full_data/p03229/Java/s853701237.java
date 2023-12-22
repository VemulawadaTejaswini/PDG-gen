import java.util.Scanner;
import java.util.ArrayList;
class Main{
   public static void main(String[] args){
      int a;
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      ArrayList<Integer> Ar=new ArrayList<Integer>();
         Ar.add(0);
         Ar.add(1000000000);
      for(int i=1;i<=N;i++){
         a=sc.nextInt();
         for(int j=0;j<i;j++){
            if(Ar.get(j)<=a&&a<=Ar.get(j+1)){
                     Ar.add(Ar.get(i));
                 for(int k=i;k>j;k--){
                     Ar.set(k,Ar.get(k-1));
                }Ar.set(j+1,a);
                 break;
           }
        }
     }int sum=0;
      for(int i=(N+1)/2+1;i<=N;i++){
         sum=sum+2*Ar.get(i);
     }if(N%2==0){
         sum=sum+Ar.get(N/2)-Ar.get(N/2+1);
     }else{
         sum=sum+Ar.get((N+1)/2)+Ar.get((N-1)/2);
     }for(int i=1;i<=(N+1)/2;i++){
         sum=sum-2*Ar.get(i);
     }System.out.print(sum);
  }
}