public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double result = Math.pow(num,3);
        System.out.println((int)result);
        sc.close();
    }
}
