import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            integers.add(Integer.valueOf(scanner.nextInt()));
        }
        int result = 0;
        for(int i = 0; i < integers.size() - 2; i++){
            int p1 = integers.get(i);
            int p2 = integers.get(i+1);
            int p3 = integers.get(i+2);
            if(p1 < p2 && p2 < p3 || p3 < p2 && p2 < p1)
                result++;
        }
        System.out.println(result);
    }
}