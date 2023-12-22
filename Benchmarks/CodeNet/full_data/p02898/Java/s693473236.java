import java.util.Scanner;
 public class Main{
   public static void main(String[]args){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
	 int k = s.nextInt();
     int a = 0;
     for(int i=0; i<n; i++){
       int h = s.nextInt();
       if(h>=k){
        a=a+1;}
     }
       System.out.println(a);
   }
 }