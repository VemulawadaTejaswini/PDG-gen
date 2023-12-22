import java.util.*;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            if ((a * b) % 2 == 0) {
              System.out.println("Even");
            } else {
              System.out.println("Odd");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}