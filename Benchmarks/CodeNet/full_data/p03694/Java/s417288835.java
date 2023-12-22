import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] house = new int[n];

        for (int i = 0; i < house.length; i++) {
            house[i] = sc.nextInt();
        }

        Arrays.sort(house);
        System.out.println(house[house.length-1] - house[0]);
    }
}