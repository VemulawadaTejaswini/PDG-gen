import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] bingoArray = new int[3][3];
        for (int i = 0; i < bingoArray.length; i++) {
            for (int k = 0; k < bingoArray.length; k++) {
                bingoArray[i][k] = scanner.nextInt();
            }
        }

        int inputSize = scanner.nextInt();

        int counter = 0;
        for (int h = 0; h < inputSize; h++) {
            int current = scanner.nextInt();

            for (int i = 0; i < bingoArray.length; i++) {
                for (int k = 0; k < bingoArray.length; k++) {
                    if (bingoArray[i][k] == current) {
                        bingoArray[i][k] = -1;
                        counter++;
                    }
                }
            }
        }

        String answer;
        if (counter < 3) {
            answer = "No";
        } else {
            if (bingoArray[0][0] == -1 && bingoArray[0][1] == -1 && bingoArray[0][2] == -1) {
                answer = "Yes";
            } else if (bingoArray[1][0] == -1 && bingoArray[1][1] == -1 && bingoArray[1][2] == -1) {
                answer = "Yes";
            } else if (bingoArray[2][0] == -1 && bingoArray[2][1] == -1 && bingoArray[2][2] == -1) {
                answer = "Yes";
            } else if (bingoArray[0][0] == -1 && bingoArray[1][0] == -1 && bingoArray[2][0] == -1) {
                answer = "Yes";
            } else if (bingoArray[0][1] == -1 && bingoArray[1][1] == -1 && bingoArray[2][1] == -1) {
                answer = "Yes";
            } else if (bingoArray[0][2] == -1 && bingoArray[1][2] == -1 && bingoArray[2][2] == -1) {
                answer = "Yes";
            } else if (bingoArray[0][0] == -1 && bingoArray[1][1] == -1 && bingoArray[2][2] == -1) {
                answer = "Yes";
            } else if (bingoArray[2][0] == -1 && bingoArray[1][1] == -1 && bingoArray[0][2] == -1) {
                answer = "Yes";
            } else {
                answer = "No";
            }
        }
        System.out.println(answer);
    }
}
