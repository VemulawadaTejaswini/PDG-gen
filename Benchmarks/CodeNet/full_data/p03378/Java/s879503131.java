import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        String[] d = sc.nextLine().split(" ");
        int a = Integer.parseInt(x[0]);
        int c = Integer.parseInt(x[2]);

        int count = 0;
        for (int i=c; i <= a; i++) {
            for (String e : d) {
                if (Integer.parseInt(e) == i) {
                    count++;
                }
            }
        }
        int count2 = 0;
        for (int i = c; i >= 0; i--) {
            for (String e : d) {
                if (Integer.parseInt(e) == i) {
                    count2++;
                }
            }
        }
        if (count < count2) {
            System.out.println(count);
        } else {
            System.out.println(count2);
        }
    }

    static int getInt(String val) {
        return Integer.parseInt(val);
    }
}