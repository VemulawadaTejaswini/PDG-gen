import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        if (n % 2 == 0) {
            for (int i = n-1; i >= 0; i -= 2) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
            
            for (int i = 0; i < n; i += 2) {
                System.out.print(array[i]);
                
                if (i == n-2) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        } else {
            for (int i = n-1; i >= 0; i -= 2) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
            
            for (int i = 1; i < n; i += 2) {
                System.out.print(array[i]);
                
                if (i == n-2) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
