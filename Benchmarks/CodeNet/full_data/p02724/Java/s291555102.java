import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int X = stdIn.nextInt();

        int happinessValue = (X / 500) * 1000 + ((X % 500) / 5) * 5;

        System.out.println(happinessValue);
    }
}