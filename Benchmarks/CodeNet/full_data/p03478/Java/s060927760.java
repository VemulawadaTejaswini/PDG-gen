import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int result = 0;
        for (int i = 1; i <= N; i++) {
            int n = i;
            int digSum = 0;
            while (n > 0) {
                // 整数 n を10で割ると一桁目の数が余りとして出てくる
                // 一桁目が 0 ならば、割り切れるので余りは 0
                digSum += n % 10; // 各桁の合計digSum にこの余りの値を加えてやる。
                // 次の桁に行くために、整数 n を10で割ってやる。そうすると最下位の桁が捨てられる。
                n /= 10;
            }
            if (digSum >= A && digSum <= B) {
                result += i;
            }
        }
        System.out.println(result);
    }
}