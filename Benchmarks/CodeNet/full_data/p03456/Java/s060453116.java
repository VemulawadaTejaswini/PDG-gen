import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int addedNum = Integer.parseInt(a + b);
        for (int i = 0; i < 316; i++) {
            if (addedNum == i * i) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}
