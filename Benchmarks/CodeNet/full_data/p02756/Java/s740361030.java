import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputStringData = scanner.nextLine();
        String inputRepeatData = scanner.nextLine();
        int repeatNumber = Integer.parseInt(inputRepeatData);
        for (int index1 = 0; index1 < repeatNumber; index1++) {
            String inputOperationRowBeforeEdit = scanner.nextLine();
            String[] inputOperationRow = inputOperationRowBeforeEdit.split(" ");
            int operation1 = Integer.parseInt(inputOperationRow[0]);
            if (operation1 == 1) {
                char[] inputCharArray = inputStringData.toCharArray();
                inputStringData = null;
                char[] reverseCharArray = new char[inputCharArray.length];
                int reverseIndex = 0;
                for (int index2 = inputCharArray.length - 1; index2 >= 0; index2--) {
                    reverseCharArray[reverseIndex] = inputCharArray[index2];
                    reverseIndex++;
                }
                for (int index = 0; index < reverseCharArray.length; index++) {
                    inputCharArray[index] = reverseCharArray[index];
                }
                inputStringData = new String(inputCharArray);
                inputCharArray = null;
                reverseCharArray = null;
            } else if (operation1 == 2) {
                int operation2 = Integer.parseInt(inputOperationRow[1]);
                if (operation2 == 1) {
                    inputStringData = inputOperationRow[2] + inputStringData;
                } else if (operation2 == 2) {
                    inputStringData = inputStringData + inputOperationRow[2];
                }
            }
            inputOperationRow = null;
        }
        scanner.close();

        // 結果の出力
        System.out.println(inputStringData);

    }

}