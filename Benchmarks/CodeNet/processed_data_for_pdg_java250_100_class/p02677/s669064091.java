public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        double theta1 = Math.toRadians(H * 30.0 + M * 0.5);
        double theta2 = Math.toRadians(M * 6.0);
        double dist = 0.0;
        if (theta1 > theta2) {
            dist = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(theta1 - theta2));
        } else {
            dist = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(theta2 - theta1));
        }
        System.out.println(dist);
    }
}
