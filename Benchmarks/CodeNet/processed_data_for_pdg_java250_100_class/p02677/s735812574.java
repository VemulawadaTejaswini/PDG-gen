public class Main {
    static Scanner sc = new Scanner(System.in);
    static int A = sc.nextInt();
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static int M = sc.nextInt();
    public static void main(String[] args) {
        double kHour = H * 30 + M * 0.5;
        double kMin = M * 6;
        double kakudo = kHour - kMin;
        if (kakudo > 180){
            kakudo = 360 - kakudo;
        } else if (kakudo < 0){
            kakudo *= -1;
        }
        double dC = A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(kakudo));
        double result = Math.sqrt(dC);
        System.out.print(result);
    }
}
