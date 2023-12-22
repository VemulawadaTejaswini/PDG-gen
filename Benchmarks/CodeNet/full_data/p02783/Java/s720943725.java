import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int attack = scanner.nextInt();
        int result = hp / attack;
        int remain = hp % attack;
        if(remain != 0) result +=1;

        scanner.close();
        System.out.println(result);
    }
}