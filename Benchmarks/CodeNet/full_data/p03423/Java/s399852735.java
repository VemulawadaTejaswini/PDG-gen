import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>2){
            if(n%3<2&&n%3>0){
                System.out.println(n/3);
            }
            else{
                System.out.println(n/3);
            }
        }
        else{
            System.out.println("0");
        }
        
        
    }
}
