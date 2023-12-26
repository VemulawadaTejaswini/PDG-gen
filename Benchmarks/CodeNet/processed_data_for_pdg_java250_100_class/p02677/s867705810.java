public class Main {
    private static double LONG_ANGLE  = 0.5;
    private static double SHORT_ANGLE = 6.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double angleH = LONG_ANGLE  * (h * 60 + m);
        double angleM = SHORT_ANGLE * m;
        double angle = 0;
        if (angleH > angleM) {
            angle = angleH - angleM;
        } else {
            angle = angleM - angleH;
        }
        System.out.println(
                Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angle))));
    }
}
