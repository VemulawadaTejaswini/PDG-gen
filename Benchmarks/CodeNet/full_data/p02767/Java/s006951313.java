
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> position = new ArrayList<Integer>();
        for(int i = 0; i < people; i++) {
            position.add(scanner.nextInt());
        }
        long venue = Math.round(Double.valueOf(position.stream().mapToInt(m -> m.intValue()).average().getAsDouble()));
        long stamina = 0;
        for(long i: position) {
            stamina = stamina + (i-venue)*(i-venue);
        }
        System.out.println(stamina);
    }
}
