public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ap = a + b;
        int am = a - b;
        int ak = a * b;
        int maxxx = Math.max(ap, am);
        int mayyy = Math.max(maxxx, ak);
        System.out.println(mayyy);
    }
}
