import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        if (a+b == c || a+c == b || b+c == a){
            System.out.println("Yes");
        }
        
        else{
            System.out.println("No");
        }
        
    }
}