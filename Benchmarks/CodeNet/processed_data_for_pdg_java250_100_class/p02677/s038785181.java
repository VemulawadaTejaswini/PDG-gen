public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double tan = 0;
        tan = (H * 30) + (M * 0.5);
        double tyo = 0;
        tyo = (M * 6);
        double kaku = 0;
        kaku = (tan - tyo);
        double radi = Math.toRadians(kaku);
        double C = 0;
        C = Math.cos(radi);
        C = Math.sqrt(((A*A) + (B*B)) - ((2*A*B)*C));
        System.out.println(C);
    }
}
