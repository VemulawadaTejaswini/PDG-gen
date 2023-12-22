import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(a b)
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = "Draw";
        int strengthA = calcStrength(a);
        int strengthB = calcStrength(b);
        if (strengthA > strengthB) {
            result = "Alice";
        } else if (strengthA < strengthB) {
            result = "Bob";
        }
        System.out.println(result);
        sc.close();
    }

    /**
     * 2->1, 3->2, ..., 13->12, 1->13
     * @param value card value
     * @return strength
     */
    private static int calcStrength(int value) {
        int strength = value - 1;
        return (strength > 0) ? strength : strength + 13;
    }
}