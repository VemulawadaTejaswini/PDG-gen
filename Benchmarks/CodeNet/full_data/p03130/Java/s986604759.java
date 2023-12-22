import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < 6; i++) {
            int x = sc.nextInt();
            if (x == 1) count1++;
            if (x == 2) count2++;
            if (x == 3) count3++;
            if (x == 4) count4++;
        }

        if (count1 > 2 || count2 > 2 || count3 > 2 || count4 > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
