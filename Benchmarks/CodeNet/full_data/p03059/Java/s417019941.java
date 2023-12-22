import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int bisc = sc.nextInt();
        int limit = sc.nextInt();

        int ans = (int)(limit / sec) * bisc;
        System.out.println(ans);
    }
}