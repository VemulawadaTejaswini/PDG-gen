import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startA = sc.nextInt();
        int startB = sc.nextInt();
        int goalA = sc.nextInt();
        int goalB = sc.nextInt();
        String str = sc.next();
        str = str.substring(startA - 1);
        
        if (str.contains("##")) {
            System.out.println("No");
            return;
        }
        
        if (goalA < goalB) {
            System.out.println("Yes");
        } else {
            if (str.contains("...")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
