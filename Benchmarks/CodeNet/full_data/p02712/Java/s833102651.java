import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += calcFizBuzz(i);
        }
        System.out.println(answer);
        sc.close();
    }

    private static int calcFizBuzz(int n) {
        int rtn = n;
        if (((n % 3) == 0) || ((n % 5) == 0)) {
            rtn = 0;
        }
        return rtn;
    }
}
