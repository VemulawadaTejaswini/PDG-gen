import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a <= 9) {
            System.out.println(a);
        } else if (10 <= a && a <= 99) {
            System.out.println(9);
        } else if (100 <= a && a <= 999) {
            System.out.println(a - 99 + 9);
        } else if (1000 <= a && a <= 9999) {
            System.out.println(909);
        } else if (10000 <= a && a <= 99999) {
            System.out.println(a - 9999 + 909);
        } else {
            System.out.println(90909);
        }
    }
}
