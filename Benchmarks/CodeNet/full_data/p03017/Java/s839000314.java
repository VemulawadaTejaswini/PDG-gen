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
        String str2 = str.substring(startA, Math.max(goalA, goalB));
        String str3 = str.substring(Math.max(0, startB - 1), Math.min(n - 1, goalB + 2));
        
        if (str2.contains("##")) {
            System.out.println("No");
            return;
        }
        
        if (goalA < goalB) {
            System.out.println("Yes");
        } else {
            if (str3.contains("...")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
