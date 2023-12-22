import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        if (arr[2] == arr[3] && arr[4] == arr[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}