public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String[] ss = S.split("");

        // 左から見ていく戦法
        int result1 = 0;
        for (int i = 0; i < N-1; i++) {
            if (ss[i].equals("#") && ss[i+1].equals(".")) {
                ss[i+1] = "#";
                result1++;
            }
        }

        ss = S.split("");
        // 右から見ていく戦法
        int result2 = 0;
        for (int i = N-1; i > 0; i--) {
            if (ss[i].equals(".") && ss[i-1].equals("#")) {
                ss[i-1] = ".";
                result2++;
            }

        }

        System.out.println(result1 < result2 ? result1 : result2);
    }
}