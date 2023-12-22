import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputStringData = scanner.nextLine();
        String inputRepeatData = scanner.nextLine();
        int repeatNumber = Integer.parseInt(inputRepeatData);
        String[][] inputOperationRow = new String[repeatNumber][3];
        for (int index = 0; index < repeatNumber; index++) {
            String inputOperationRowBeforeEdit = scanner.nextLine();
            inputOperationRow[index] = inputOperationRowBeforeEdit.split(" ");
        }
        scanner.close();

        // 文字列の加工
        for (String[] editData : inputOperationRow) {
            switch (editData[0]) {
                case "1":
                    char[] inputCharArray = inputStringData.toCharArray();
                    char[] reverseCharArray = new char[inputCharArray.length];
                    int reverseIndex = 0;
                    for (int index = inputCharArray.length - 1; index >= 0; index--) {
                        reverseCharArray[reverseIndex] = inputCharArray[index];
                        reverseIndex++;
                    }
                    for (int index = 0; index < reverseCharArray.length; index++) {
                        inputCharArray[index] = reverseCharArray[index];
                    }
                    inputStringData = new String(inputCharArray);
                    break;
                case "2":
                    switch (editData[1]) {
                        case "1":
                            inputStringData = editData[2] + inputStringData;
                            break;
                        case "2":
                            inputStringData = inputStringData + editData[2];
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

        // 結果の出力
        System.out.println(inputStringData);

    }

}