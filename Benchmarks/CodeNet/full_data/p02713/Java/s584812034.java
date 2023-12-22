import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int k =kbd.nextInt();
   long a=0;
   long n=0;
   for(int i=1;i<=k;i++){
     for(int j=1;j<=k;j++){
       for(int l=1;l<=k;l++){
        for(int m=1;m<=i;m++){
           if(i%m==0&&j%m==0&&l%m==0){
             n=m;
        }
      }
        a=a+n;
       }
     }
   }
 System.out.println(a);
}
}
