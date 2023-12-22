public class Main {

    public static void main(String[] args) {
        // 入力読取
        // Scanner sc = new Scanner(System.in);
        int N = 100000;// sc.nextInt();

        // sc.close();

        // N!の取得
        // long result = 0;
        long nNum = 1;
        long num = (int) Math.pow(10, 9) + 7;
        for (int i = N; i >= 2; i--) {
            nNum = nNum * i % num;
        }

        System.out.println(nNum);
    }
}