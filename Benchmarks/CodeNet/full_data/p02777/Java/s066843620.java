import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int sb = sc.nextInt();
        int tb = sc.nextInt();
        String deleteBall = sc.next();
        if (Objects.equals(s, deleteBall)) {
            sb = sb -1;
        } else if (Objects.equals(t, deleteBall)) {
            tb = tb -1;
        }
        System.out.println(sb + " " + tb);
    }
}