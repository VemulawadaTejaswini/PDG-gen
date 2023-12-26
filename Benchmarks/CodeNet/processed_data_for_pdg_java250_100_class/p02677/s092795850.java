public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
		int M = sc.nextInt();
		double minAngle = (double)M * 6;
		double onlyHour = (double)H * 30;
		double hourAngle = onlyHour + (double)M * 0.5;
		double angle = Math.abs(minAngle - hourAngle);
		if(angle > 180)
		angle = 360 - angle;
		double ans = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(angle)));
		System.out.println(ans);
    }
}
