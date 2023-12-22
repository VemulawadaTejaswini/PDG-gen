import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] num = {a, b, c};

        int result = 0;
        Arrays.sort(num);
        for (int i=0; i<2; i++) {
            result += num[i];
        }

        System.out.println(result);
    }
}