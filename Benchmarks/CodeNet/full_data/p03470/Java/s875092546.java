import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.nextLine();
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<givenNumber; i++) {
            array.add(scanner.nextInt());
        }
        long size = array.stream().distinct().count();
        System.out.println(size);
    }
}
