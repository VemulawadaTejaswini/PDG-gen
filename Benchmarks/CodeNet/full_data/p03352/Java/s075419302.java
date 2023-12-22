import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int maxBase = (int) Math.sqrt(x);

        System.out.println(maxBase*maxBase);
    }
}
