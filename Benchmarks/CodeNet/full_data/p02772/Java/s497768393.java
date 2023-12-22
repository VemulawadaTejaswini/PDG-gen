import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbers.add(sc.nextInt());
        }

        boolean approved = true;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
               // numbers.remove(i);
            } else {
                if (numbers.get(i) % 3 == 0 || numbers.get(i) % 5 == 0) {
                    //System.out.println("APPROVED");
                } else {
                    approved = false;
                    break;
                }
            }
        }
        if (approved) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}