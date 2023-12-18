public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a * b;
        int periphery = (a + b) * 2;
        System.out.println(area + " " + periphery);
    }
}
