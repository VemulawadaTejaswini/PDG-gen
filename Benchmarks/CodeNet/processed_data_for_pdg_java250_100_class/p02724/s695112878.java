public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 500;
        int b = (n - a * 500) / 5;
        System.out.println(a*1000+b*5);
    }
}
