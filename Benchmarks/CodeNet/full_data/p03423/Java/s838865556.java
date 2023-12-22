import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println((int)Math.floor(n/3));

        scan.close();
    
    }

}