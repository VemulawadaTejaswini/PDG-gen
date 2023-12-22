import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        // 入力データの準備
        Scanner scanner = new Scanner(System.in);
        String inputCountData = scanner.nextLine();
        String inputCheckNumberData = scanner.nextLine();
        scanner.close();

        // 入力整数のチェック
        // int型への変換
        ArrayList<Integer> checkNumberList = new ArrayList<>();
        String[] editedInputCheckNumberData = inputCheckNumberData.split(" ");
        for (int cnt = 0; cnt < editedInputCheckNumberData.length; cnt++) {
            int checkNumber = Integer.parseInt(editedInputCheckNumberData[cnt]);
            checkNumberList.add(checkNumber);
        }

        // 値のチェック
        boolean checkFlag = false;
        for (int inputNumber : checkNumberList) {
            if (inputNumber % 2 == 0) {
                if (inputNumber % 3 == 0 || inputNumber % 5 == 0) {
                    checkFlag = true;
                } else {
                    checkFlag = false;
                    break;
                }
            }
        }

        // 判定結果の出力
        if (checkFlag) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }

    }

}