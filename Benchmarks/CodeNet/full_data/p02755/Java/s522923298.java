import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        //データの加工
        String[] editedInputData = inputData.split(" ");
        int smallerTax = Integer.parseInt(editedInputData[0]);
        int biggerTax = Integer.parseInt(editedInputData[1]);

        // 税抜き価格の算出
        double taxA = 0.08;
        double taxB = 0.10;
        int noTaxAUnderLimit = (int) (smallerTax / taxA);
        int noTaxBUnderLimit = (int) (biggerTax / taxB);
        int noTaxBUpperLimit = (int) ((biggerTax + 1) / taxB);

        // 判定
        if (noTaxAUnderLimit >= noTaxBUnderLimit && noTaxAUnderLimit < noTaxBUpperLimit) {
            System.out.println(noTaxAUnderLimit);
        } else {
            System.out.println("-1");
        }
        

    }

}