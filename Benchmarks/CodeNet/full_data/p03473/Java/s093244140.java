import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int leftHour = 24 - m + 24;
        System.out.println(leftHour);
    }
}
