import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> aa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            if(n % 2 == 0) {
                if(i % 2 == 1) {
                    aa.add(0, tmp);
                } else {
                    aa.add(tmp);
                }
            } else {
                if(i % 2 == 0) {
                    aa.add(0, tmp);
                } else {
                    aa.add(tmp);
                }
            }

        }
        for (Long long1 : aa) {
            System.out.print(long1 + " ");
        }
    }
}