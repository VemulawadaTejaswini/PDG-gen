import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        boolean isEven = true;
        int count = 0;
        int newCount = 0;
        for (Integer number : numbers) {
            while (isEven) {
                if (number % 2 == 0) {
                    newCount++;
                } else {
                    isEven = false;
                }
            }
            if (count > newCount) {
                count = newCount;
            }
        }

        System.out.println(count);
    }
}