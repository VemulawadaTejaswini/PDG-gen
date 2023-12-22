import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(combi(n) + combi(m));
    }

    static int combi(int a) {
        if(a == 1 || a == 0) {
            return 0;
        }else if(a == 2) {
            return 1;
        }else {
            return a * (a-1) / 2;
        }
    }
}