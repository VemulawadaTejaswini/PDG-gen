public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // a % K = b % K = c % K == 0 or A % K = b % K = c % K = (K / 2) のみ
        long cand1 = N / K;
        long cand2 = 0;
        if (K % 2 == 0) {
            cand2 = N / (K / 2) - cand1;    //cond1と数字がかぶる
        }

        out.println(cand1 * cand1 * cand1 + cand2 * cand2 * cand2);
    }
}