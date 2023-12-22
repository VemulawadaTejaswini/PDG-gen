
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p = n-m;
        if(m==1){
            System.out.println("0");
        }
        else
            System.out.println(p);
        
    }
    
}
