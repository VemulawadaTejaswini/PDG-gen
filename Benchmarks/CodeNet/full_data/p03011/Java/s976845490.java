import java.util.Arrays;
import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numbers = new int [3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = in.nextInt();
            
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0]+numbers[1]);
    }
}