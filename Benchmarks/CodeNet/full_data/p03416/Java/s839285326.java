import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for (int num = lower; num <= upper; num++) {
            if (String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
