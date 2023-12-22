import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String[] arr = n.split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a2 = Integer.parseInt(arr[1]);
        int gcd = gcd(a1, a2);
        int total = Math.abs(a1 * a2) / gcd;
        System.out.println(total);
    }
    public static int gcd(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return number1 + number2;
        } else {
            int absNumber1 = Math.abs(number1);
            int absNumber2 = Math.abs(number2);
            int biggerValue = Math.max(absNumber1, absNumber2);
            int smallerValue = Math.min(absNumber1, absNumber2);
            return gcd(biggerValue % smallerValue, smallerValue);
        }
    }
}

