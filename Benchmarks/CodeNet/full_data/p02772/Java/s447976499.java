import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isOK = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
            int checking = sc.nextInt();
            if (checking % 2 == 0) {
                if (!((checking % 3 == 0)||(checking % 5 == 0))) {
                    isOK = false;
                }
            }
        }
        if (isOK) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}