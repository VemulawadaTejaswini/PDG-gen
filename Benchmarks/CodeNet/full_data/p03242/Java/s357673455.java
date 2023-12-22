import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();

        String ans = sc.next().replace('1', '5').replace('9', '1').replace('5', '9');

        System.out.println(ans);

        long end = System.currentTimeMillis();
        System.out.println(end - start); // ms
        sc.close();
    }
}