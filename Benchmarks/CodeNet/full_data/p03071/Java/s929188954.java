import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if(a > b) {
            System.out.println(a + (a-1));
        } else if(b > a) {
            System.out.println(b + (b-1));
        } else {
            System.out.println(a*2);
        }

    }
}