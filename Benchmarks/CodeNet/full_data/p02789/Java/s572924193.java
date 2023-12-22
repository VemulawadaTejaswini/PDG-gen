import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int a,b;
       a=in.nextInt();
       b=in.nextInt();
       if(a==b){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
    
}