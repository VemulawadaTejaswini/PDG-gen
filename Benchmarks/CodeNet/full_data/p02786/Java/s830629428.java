import java.util.Scanner;
import java.lang.Math; 
public class Main
{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
     long h = s.nextInt();
     double r=0;
     for(long i=h; i>1; i=i/2){
     if(i%2==0){
         
         r=r+1;
     }
     else{
         i=i+1;
         r=r+1;
     }
     }
     double t=0;
     r=r+1;
     t=Math.pow(2, r);
     t=t-1;
     System.out.println(""+t);
    }
}