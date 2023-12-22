import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] towns = new int[4];
        String result = "YES";
        for (int i = 0; i < 6; i++) {
            int road = sc.nextInt();
            towns[road - 1]++;
            if (towns[road - 1] > 2) {
                result = "NO";
            } 
        }
        System.out.println(result);
    }
}