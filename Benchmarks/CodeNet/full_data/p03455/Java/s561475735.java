import java.util.*;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (isEven(a) || isEven(b)) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}