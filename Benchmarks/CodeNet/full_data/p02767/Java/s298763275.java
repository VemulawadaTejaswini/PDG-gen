import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int n = Integer.parseInt(values[0]);
        line = scanner.nextLine();
        values = line.split(" ");
        int min = 100;
        int max = 0;
        ArrayList<Integer> vil = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int c = Integer.parseInt(values[i]);
            if (min > c) {
                min = c;
            }
            if (max < c) {
                max = c;
            }
            vil.add(c);
        }
        long lowestHealth = 9223372036854775807L;
        long temp = 0;
        for (int i = 0; i < max - min; i++) {
            for (Integer integer : vil) {
                temp += Math.pow(integer - i,2);
            }
            if (lowestHealth > temp) {
                lowestHealth = temp;
            }
            temp = 0;
        }
        if (lowestHealth == 9223372036854775807L) {
            System.out.println(0);
        } else {
            System.out.println(lowestHealth);
        }
    }
}