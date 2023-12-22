import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);     
       int K = scan.nextInt();
       int X = scan.nextInt();
       if(K*500>=X){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }        
    }  
}
