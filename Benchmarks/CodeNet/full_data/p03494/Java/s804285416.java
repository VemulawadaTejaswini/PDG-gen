import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int count = 1000000;
        int newCount = 0;
        boolean isEven = true;
        for (Integer number : numbers) {
            newCount = 0;
            isEven = true;
            while (isEven) {
                if (number % 2 == 0) {
                    number = number / 2;
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