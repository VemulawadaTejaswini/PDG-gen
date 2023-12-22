import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int K = K.nextInt();
   int N = N.nextInt();
   
   float ans =0.0f;
     for(int i =1;i<=N;i++){
       if(i>=K){
         ans += 1/N;
       }
       if(i<K){
         int j=0;
         int num = i;
         while(num>=K){
           j++;
           num = 2*num;
         }
         double a = 1/2;
         double b = (double)j;
         double nin = Math.pow(a,b);
           
         ans += (1/N)*nin;
       }
     }
     
     System.out.println(ans);
     
   }
   

 }
}