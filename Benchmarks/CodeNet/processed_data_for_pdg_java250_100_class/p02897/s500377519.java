public class Main {
    public static void main(String[] args) {
        double probability = 0.0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (double i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                probability += 1.0;
            }
        }
        System.out.println(probability / a);
    }
}
