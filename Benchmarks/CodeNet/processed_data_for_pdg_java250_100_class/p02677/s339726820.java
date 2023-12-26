public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double hour = 0.5 * (60 * h + m);
        double min = 6 * m;
        double angle = hour-min;
        if (hour < min) {
        	angle = 360 - min + hour;
        }
        double ans = a*a + b*b - 2*a*b * Math.cos(angle / 180 * Math.PI);
        System.out.println(String.format("%.20f", Math.sqrt(ans)));
    }
}
