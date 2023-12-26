public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int oddCnt = N / 2 + N % 2;
        double ret = oddCnt / (double)N;
        System.out.print(ret);
    }
}
