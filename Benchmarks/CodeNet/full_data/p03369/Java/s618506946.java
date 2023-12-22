import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextLine().chars().filter(value -> value == 'o').map(operand -> 100).sum();
        System.out.println(s + 700);
    }
}
