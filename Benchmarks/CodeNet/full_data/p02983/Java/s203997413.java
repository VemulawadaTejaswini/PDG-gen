import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt()%2019;
        int r = scanner.nextInt()%2019;
        if (l>r) {
            System.out.println(0);
        }else {
            System.out.println((l*(l+1))%2019);
        }


    }
}
