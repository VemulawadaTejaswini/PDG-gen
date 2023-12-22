import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        String[] inputs = scanner.nextLine().split("\\s+");
        String[] friends = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(inputs[0]), K = Integer.parseInt(inputs[1]);
        for (String f : friends) {
            if (Integer.parseInt(f) >= K) res++;
        }
        System.out.println(res);

    }
}
