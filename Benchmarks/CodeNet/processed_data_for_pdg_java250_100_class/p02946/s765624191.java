public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = b - a + 1; i <= a + b - 1; i++) {
            System.out.println(i);
        }
    }
}
