mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int judgement5 = 0;
        int judgement7 = 0;

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i : number) {
            if (i == 5) {
                judgement5++;
            } else if (i == 7) {
                judgement7++;
            }
        }

        if (judgement5 == 2 && judgement7 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}