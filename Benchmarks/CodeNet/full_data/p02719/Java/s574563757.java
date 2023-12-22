import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   long n =kbd.nextLong();
   long k =kbd.nextLong();
   long M=0;
   long m=n;

     if(k==1){
       System.out.println("0");
     }else{
     if(n-k>0){
       M=n-k;
     }else{
       M=-(n-k);
     }
     if(M<m){
       m=M;
     }
     if(m-k>0){
       M=m-k;
     }else{
       M=-(m-k);
     }
     while(m>M){
     if(M<m){
       m=M;
     }
     if(m-k>0){
       M=m-k;
     }else{
       M=-(m-k);
     }
}

   System.out.println(m);
 }
 }
}