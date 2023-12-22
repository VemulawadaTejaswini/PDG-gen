import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //int あ = 10;
         Scanner scan = new Scanner(System.in);
 
        
        int p = scan.nextInt();
        int q = scan.nextInt();
        int r = scan.nextInt();
        
        if(p+q<q+r){
            if(p+q<p+r){
                System.out.println(p+q);
            }
            else{
                System.out.println(r+p);
            }
        }
        else{
            if(q+r<p+r){
                System.out.println(q+r);
            }
            else{
                System.out.println(r+p);
            }
        }
        

    }
}
