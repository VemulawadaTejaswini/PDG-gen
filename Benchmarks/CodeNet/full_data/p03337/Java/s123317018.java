import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest = -999999;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;

        largest = add > largest ? add : largest;
        largest = sub > largest ? sub : largest;
        largest = mul > largest ? mul : largest;

        System.out.println(largest);
    }
}