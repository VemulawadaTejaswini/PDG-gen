import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int d = stdIn.nextInt();
        
        int r = (n / (2 * d + 1));
        
        if(n % (2 * d + 1) != 0){
            r++;
        }
        
        
        System.out.println(r);
    }
}
