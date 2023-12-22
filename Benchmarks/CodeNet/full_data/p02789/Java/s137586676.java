import java.util.Scanner;
 public class Main{
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     if(a<b){
     for(int i=0; i<b; i++){
       String s = String.valueOf(a);
       System.out.println(s);
     }
     }else if(a>b){
       for (int j=0; j<a; j++){
         String st = String.valueOf(b);
         System.out.println(st);
       }
       }
   }
 }