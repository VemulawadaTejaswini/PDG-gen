import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startA = sc.nextInt() - 1;
        int startB = sc.nextInt() - 1;
        int goalA = sc.nextInt() - 1;
        int goalB = sc.nextInt() - 1;
        String str = sc.next();
        str = str.substring(startA, goalB);
        String str2 = str.substring(Math.max(0, startA - 1), Math.min(n - 1, goalB + 1);
        
        if (str.contains("##")) {
            System.out.println("No");
            return;
        }
        
        if (goalA < goalB) {
            System.out.println("Yes");
        } else {
            if (str2.contains("...")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
