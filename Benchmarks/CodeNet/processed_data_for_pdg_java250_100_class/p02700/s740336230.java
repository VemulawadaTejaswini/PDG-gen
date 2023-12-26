public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double takahashi = Math.ceil( a / d );
        double aoki = Math.ceil( c / b );
        System.out.println( takahashi >= aoki ? "Yes" : "No" );
        sc.close();
    }
}
