import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int fee = sc.nextInt();
        int result = 0;
        if (age <= 5) {
            result = 0;
        } else if (age <= 12) {
            result = fee / 2;
        } else {
            result = fee;
        }
        System.out.println(result);
    }
}