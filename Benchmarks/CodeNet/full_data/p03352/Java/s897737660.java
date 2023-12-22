import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int i = 1;
        while (true) {
            if (i * i > X) {
                System.out.println((i - 1) * (i - 1));
                break;
            }
            i++;
        }
    }
}