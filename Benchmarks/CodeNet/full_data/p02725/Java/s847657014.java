import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long perimeter = scanner.nextLong();
        long numberOfHouses = scanner.nextLong();

        long maxDistance = 0;
        long first = scanner.nextInt();
        long previous = first;
        long sum = 0;
        for (long i = 0; i < numberOfHouses - 1; i++) {
            long next = scanner.nextLong();
            long currentDistance = next - previous;
            sum += currentDistance;
            previous = next;
            if (currentDistance > maxDistance) {
                maxDistance = currentDistance;
            }
        }
        long lastDistance = perimeter - previous + first;
        sum += lastDistance;
        if (lastDistance > maxDistance) {
            maxDistance = lastDistance;
        }
        System.out.println(sum - maxDistance);
    }
}
