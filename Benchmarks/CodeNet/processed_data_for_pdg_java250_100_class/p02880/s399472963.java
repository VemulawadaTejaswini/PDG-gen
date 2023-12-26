public class Main {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (N == a * b) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
