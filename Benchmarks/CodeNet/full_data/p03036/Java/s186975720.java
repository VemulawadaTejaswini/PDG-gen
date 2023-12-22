import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();

        int xi = x2000;
        for (int i=0; i<10; i++) {
            int xi1 = r * xi - D;
            System.out.println(xi1);
            xi = xi1;
        }

    }
}
