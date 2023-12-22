
import java.util.Scanner;

/**
 * @author yoshizaki
 * ABC 132
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        for(int i = 0; i < len ; i++) {
            numbers[i] = scanner.nextInt();
        }
        int answer = 0;
        for (int i = 1; i < len - 1 ; i++) {
            if(numbers[i-1] < numbers[i] && numbers[i] < numbers[i+1]) answer++;
            if(numbers[i-1] > numbers[i] && numbers[i] > numbers[i+1]) answer++;
        }
        System.out.println(answer);
    }
}