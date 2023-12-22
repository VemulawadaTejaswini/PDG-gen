
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String input = sc.nextLine();
        System.out.println(execute(input));

    }

    public static int execute(String input) {

        List<String> list = Arrays.asList(input.split(" "));
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                i++;
                sum++;
            }
        }
        return sum;
    }
}
