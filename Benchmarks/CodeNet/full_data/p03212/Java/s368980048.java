import java.util.Scanner;

public class Main {
    static Long N;
    static int count;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        scanner.close();
    }


    private static void dfs(long i, boolean is3, boolean is5, boolean is7) {
        if(N < i) return;

        if(is3 && is5 && is7) count++;

        dfs(i * 10 + 3, true, is5, is7);
        dfs(i * 10 + 5, is3, true, is7);
        dfs(i * 10 + 7, is3, is5, true);

    }

    public static void main(String[] args) {
        init();
        dfs(0, false, false, false);
        System.out.println(count);
    }
}