import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        // n = 4x + 7y;
        boolean result = false;
        if (n%4 == 0 || n%7 == 0) {
            result = true;
        }
        
        for (int i = 0; i < n; i++) {
            if(n%(4*i +7) == 0 || n%(7*i +4) == 0) {
                result = true;
                break;
            }
        }
        
        if(result == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}