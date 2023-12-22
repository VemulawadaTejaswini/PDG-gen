import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dic = new int[m+1];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            boolean flag = false;
            for (String s : line.split(" ")) {
                if (flag) {
                    dic[Integer.valueOf(s).intValue()]++;
                } else {
                    flag = true;
                }

            }
        }

        int sum = 0;
        for (int i : dic) {
            if (i == n) sum++;
        }
        System.out.println(sum);
    }
}