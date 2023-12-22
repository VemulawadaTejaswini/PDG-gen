import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.valueOf(scan.next());
        int b = Integer.valueOf(scan.next());
        int c = Integer.valueOf(scan.next());
        scan.close();

        int[] can = {a,b,c};

        Arrays.sort(can);

        if(can[1]-can[0]<can[2]) {
            int sa = can[1]-can[0];
            int res = can[2]-sa;
            if(res%2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }

}
