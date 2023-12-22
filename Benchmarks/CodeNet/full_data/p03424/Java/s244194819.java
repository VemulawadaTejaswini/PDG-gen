import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        boolean flag = false;
        for (int j = 0; j < str.length; j++) {
            if (str[j].equals("Y")) {
                flag = true;
            }
        }
        System.out.println(flag);
        if (flag) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}
