import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int A=kbd.nextInt();
   int B=kbd.nextInt();
   int x=-1;
   for(int i=13;i<=1010;i++){
     double n=Math.floor(i*0.08);
     double m=Math.floor(i*0.1);
     if(A==n&&B==m){
       x=i;
       break;
     }
   }
    System.out.println(x);
 }
}

