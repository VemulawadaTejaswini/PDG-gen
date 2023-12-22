import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int inputInt = scanner.nextInt();

        int reverseCounter = 0;
        boolean startIsStart = true;
        for (int i = 0; i < inputInt; i++) {
            int T = scanner.nextInt();
            if (T == 1) {
                reverseCounter++;
                if (startIsStart) {
                    startIsStart = false;
                } else {
                    startIsStart = true;
                }
            } else {
                int F = scanner.nextInt();
                String C = scanner.next();
                if (startIsStart) {
                    if (F == 1) {
                        inputString = C + inputString;
                    } else {
                        inputString += C;
                    }
                } else {
                    if (F == 2) {
                        inputString = C + inputString;
                    } else {
                        inputString += C;
                    }
                }
            }
        }

        int a = reverseCounter % 2;
        if (a == 1) {
            System.out.println(new StringBuilder(inputString).reverse().toString());
        } else {
            System.out.println(inputString);
        }
    }
}
