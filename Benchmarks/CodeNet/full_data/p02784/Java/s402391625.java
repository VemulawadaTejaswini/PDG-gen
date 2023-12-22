import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        if(h > list.stream().mapToInt(m -> m).sum()){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
