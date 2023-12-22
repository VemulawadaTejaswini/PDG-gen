import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int coinNum;
        int inputCash;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editedInputData = inputData.split(" ");

        coinNum = Integer.parseInt(editedInputData[0]);
        inputCash = Integer.parseInt(editedInputData[1]);

        int sumCoinCash = coinNum * 500;

        if (sumCoinCash >= inputCash) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}