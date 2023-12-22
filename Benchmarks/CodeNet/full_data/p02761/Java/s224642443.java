import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        int digitNum = scanner.nextInt();
        int checkNum = scanner.nextInt();
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int count = 0; count < checkNum; count++) {
            int checkDigitNumber = scanner.nextInt();
            int displayDigitNumber = scanner.nextInt();
            if (!resultMap.isEmpty() && resultMap.get(checkDigitNumber) != null && resultMap.get(checkDigitNumber) != displayDigitNumber) {
                System.out.println("-1");
                scanner.close();
                return;
            } else {
                resultMap.put(checkDigitNumber, displayDigitNumber);
            }
        }
        scanner.close();

        // 結果の出力
        StringBuilder displayBuilder = new StringBuilder();
        if (resultMap.get(1) != null && resultMap.get(1) == 0) {
            System.out.println("-1");
            return;
        } else {
            if (digitNum == 0) {
                if (resultMap.get(1) == null) {
                    displayBuilder.append(0);
                } else {
                    displayBuilder.append(resultMap.get(1));
                }
            } else {
                for (int count = 1; count <= digitNum; count++) {
                    if (count != 1 && resultMap.get(count) == null) {
                        displayBuilder.append(0);
                    } else if (count == 1 && resultMap.get(count) == null) {
                        displayBuilder.append(1);
                    } else {
                        displayBuilder.append(resultMap.get(count));
                    }
                }
            }
            System.out.println(displayBuilder.toString());
        }

    }

}