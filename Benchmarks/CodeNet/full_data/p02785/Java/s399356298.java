import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonsters = scanner.nextInt();
        int numberOfSpecialAttacks = scanner.nextInt();

        List<Integer> monsters = new ArrayList<>();
        for (int i = 0; i < numberOfMonsters; i++) {
            monsters.add(scanner.nextInt());
        }
        Collections.sort(monsters);

        long sum = 0;
        for (int i = 0; i < (monsters.size() - numberOfSpecialAttacks); i++) {
            sum += monsters.get(i);
        }
        System.out.println(sum);
    }
}