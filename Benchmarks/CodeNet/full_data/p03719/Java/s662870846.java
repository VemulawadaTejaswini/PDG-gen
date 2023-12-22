import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        if (a <= c && b >= c){
            System.out.println("Yes");
        }
        else System.out.println("No");
    
    }
}
