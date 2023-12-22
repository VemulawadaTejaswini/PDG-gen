import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();
        String res = recBager(n);
//        System.out.println(res);

        int pate = 0;
        for (int i = res.length()-1; res.length() - x <= i; i--) {
            if (res.charAt(i) == 'P') pate++;
        }
        System.out.println(pate);
    }

    public static String recBager(int n) {
        if (n == 0) {
            return "P";
        } else {
            String tmp = recBager(n - 1);
            return "B" + tmp + "P" + tmp + "B";
        }
    }

}