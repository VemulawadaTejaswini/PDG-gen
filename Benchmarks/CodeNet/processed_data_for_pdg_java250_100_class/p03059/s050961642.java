public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        double a = ((double)T + 0.5)/A;
        System.out.println((int)a*B);
    }
}
