import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> valList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            valList.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        Integer val = valList.get(0);
        for (int i = 1; i < valList.size(); i++) {
            if (Math.abs(val - valList.get(i)) > k) {
                System.out.println(":(");
                System.exit(0);
            }
        }
        System.out.println("Yay!");
    }
}
