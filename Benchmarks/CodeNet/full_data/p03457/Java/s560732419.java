import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int time = Integer.parseInt(sc.nextLine());
        Map<Integer, Integer> nowPlace = new HashMap<>();
        int t = 0;
        int x = 0;
        int y = 0;
        int count = 0;

        for (int i = 0; i < time; i++) {
            String[] inputs = sc.nextLine().split(" ");
            t = Integer.parseInt(inputs[0]);
            x = Integer.parseInt(inputs[1]);
            y = Integer.parseInt(inputs[2]);
            if (x + y <= t && t % (x + y) == 0) {
                count++;
            }
        }
        if (count == time) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
