import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split(" ");
        int k = Integer.valueOf(strs[0]);
        int x = Integer.valueOf(strs[1]);

        for(int i = x - (k - 1); i < x + (k - 1); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}