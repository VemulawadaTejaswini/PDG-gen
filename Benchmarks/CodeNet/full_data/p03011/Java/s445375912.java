import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            list.add(scan.nextInt());
        }
        
        List<Integer> result = list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result.get(0) + result.get(1));

        scan.close();
    }
}