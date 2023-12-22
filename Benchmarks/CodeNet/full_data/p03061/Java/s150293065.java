import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> AiList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            AiList.add(sc.nextInt());
        }
        sc.close();
        if ( N == 2) {
            Nis2(AiList.get(0), AiList.get(1));
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
        	Integer temp = AiList.get(i);
            AiList.remove(i);
            if (max < getGCD(AiList)) {
                max = getGCD(AiList);
            }
            AiList.add(i, temp);
        }
        System.out.println(max);
    }
    public static void Nis2 (int a, int b) {
        System.out.println(Math.max(a, b));
        System.exit(0);
    }
    public static int gcd (int a, int b) {
        if( a % b == 0 ) {
            return b;
        }
        return gcd( b, a % b );
    }
    public static int getGCD (List<Integer> list) {
        int len = list.size();
        int g = gcd(list.get(0), list.get(1));
        for (int i = 1; i < len - 1; i++) {
            g = gcd(g, list.get(i + 1));
        }
        return g;
    }
}