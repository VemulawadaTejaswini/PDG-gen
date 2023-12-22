import java.util.*;
class Main {
    static int count = 0;
    static long N = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println(f("0"));
    }

    static int f(String S) {
        if(Long.parseLong(S) > N) return 0;
        else {
            if(S.contains("7")&&S.contains("5")&&S.contains("3")) count++;
            f(S + "7");
            f(S + "5");
            f(S + "3");
            return count;
        }
    }
}