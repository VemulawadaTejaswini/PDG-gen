public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();
    System.out.printf("%.5f %.5f",  (radius*radius*Math.PI), (2*Math.PI*radius));
    }
}
