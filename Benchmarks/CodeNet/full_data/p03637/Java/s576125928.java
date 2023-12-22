import java.util.Scanner;

public class Main {
    boolean[][] array;
    int n;
    void run() {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int even4 = 0;
        int even2 = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num % 4 == 0)
                even4++;
            else if (num % 2 == 0)
                even2++;
            else
                odd++;
        }
        if (even2 != 0)
            odd++;
        System.out.println(even4 >= odd - 1?"Yes":"No");
    }

    public static void main(String[] args) {
        new Main().run();
    }
}