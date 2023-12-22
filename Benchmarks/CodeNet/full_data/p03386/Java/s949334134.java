import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        Set<Integer> resultSet = new LinkedHashSet<>();
        for (int i = 1; i <= b; i++) {
           if(i >= a && i <= b) {
              resultSet.add(i);
           }
        }
        for(Integer result : resultSet){
            System.out.println(result);
        }

    }


}
