import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean hasY = false;
        for (int i = 0; i < n; i++) {
            if (sc.next().equals("Y")) {
                hasY = true;
            }
        }
        System.out.println(hasY ? "Four" : "Three");
    }
}
