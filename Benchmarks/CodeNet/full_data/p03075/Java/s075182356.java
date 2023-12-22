import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            positions[i] = sc.nextInt();
        }
        
        int border = sc.nextInt();
        boolean pass = true;
        
        for (int i = 0; i < n - 1; i++) {
            int difference = positions[i + 1] - positions[i];
            if (difference > border) {
                pass = false;
                break;
            }
        }
        
        if (pass) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}