import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (s[i].equals(s[i - 1])) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }

}

