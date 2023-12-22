import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int K = K.nextInt();
   int N = N.nextInt();
   
   float ans =0.0f;
     for(int i =1;i<=N;i++){
       if(i>=K){
         ans += (1.0/N);
       }
       if(i<K){
         float j=1.0;
         int num = i;
         while(num<K){
           j /=2;
           num = 2*num;
         }
         ans += (1/N)*j;
       }
     }
     
     System.out.println(ans);
     
   
 
 }
}