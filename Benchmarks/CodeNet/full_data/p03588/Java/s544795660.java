import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxIndex = 0;
        int maxValue = 0;
        int n = sc.nextInt();
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(" ");
            int a = Integer.valueOf(split[0]);
            int b = Integer.valueOf(split[1]);
            if (maxIndex < a) {
                maxIndex = a;
                maxValue = b;
            }
        }
        System.out.println(maxIndex + maxValue);
    }
}