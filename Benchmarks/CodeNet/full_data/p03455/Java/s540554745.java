import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        
        int x= sc.nextInt ();
         int y= sc.nextInt ();
        
        int result;
        result = (x*y);
        if (result%2==0){
           System.out.println("even");
        }
        else {
               System.out.println("odd");
        }
        
    }
}