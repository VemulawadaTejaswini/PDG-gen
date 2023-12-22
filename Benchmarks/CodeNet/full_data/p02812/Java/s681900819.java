import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        int res = 0;
        for (int i = 0; i < n - 3; i++) {
            if("ABC".equals(s.substring(i, i + 3))){
                res++;
            }
        }
        System.out.println(res);
    }
}
