import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.exec();
    }

    private void exec() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            words.add(scanner.nextLine());
        }
        Collections.sort(words);
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word );
        }
        System.out.println(result);
    }
}