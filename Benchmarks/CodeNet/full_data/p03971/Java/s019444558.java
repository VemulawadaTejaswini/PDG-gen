import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int local = a + b;
        int nowA = 0;
        int nowB = 0;

        String[] s = sc.next().split("");

        for (int i = 0; i < s.length; i++) {
            switch (s[i]) {
                case "a":
                    if (nowA + nowB < local) {
                        nowA++;
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case "b":
                    if (nowA + nowB < local && nowB < b) {
                        nowB++;
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case "c":
                    System.out.println("No");
                    break;
            }
        }
    }
}