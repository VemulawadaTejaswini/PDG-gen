import java.util.Scanner;
public class Main{
    
public static void main( String args[]) {
  Scanner sc = new Scanner(System.in);
   String s ;
   
   int n = sc.nextInt();
    s = sc.nextLine().toLowerCase();
    if(n<3600)
    System.out.println("red");
    else 
    System.out.println(s);
}
  
         
    }