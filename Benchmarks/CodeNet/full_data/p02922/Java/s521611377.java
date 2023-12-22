import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int tap = std.nextInt();
        int needCount = std.nextInt();
        int count = 0;
        while (needCount > tapCount(count, tap)) {
            count++;
        }

        System.out.println(count);
    }

    private static int tapCount(int count, int tap) {
        if (count == 1) {
            return tap;
        } else {
            return tap * count - (count - 1);
        }
    }
}
