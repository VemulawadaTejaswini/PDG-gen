import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] cStr = str.toCharArray();

        String num1 = new StringBuilder().append(String.valueOf(cStr[0])).append(String.valueOf(cStr[1])).toString();
        String num2 = new StringBuilder().append(String.valueOf(cStr[2])).append(String.valueOf(cStr[3])).toString();

        boolean num1MMFlg = false;
        boolean num2MMFlg = false;

        if(1 <= Integer.parseInt(num1) && Integer.parseInt(num1) <= 12){
            num1MMFlg = true;
        }

        if(1 <= Integer.parseInt(num2) && Integer.parseInt(num2) <= 12){
            num2MMFlg = true;
        }

        if(num1MMFlg && num2MMFlg){
            System.out.println("AMBIGUOUS");
            return;
        }

        if(num1MMFlg){
            System.out.println("MMYY");
            return;
        }

        if(num2MMFlg){
            System.out.println("YYMM");
            return;
        }

        System.out.println(Integer.parseInt("NA"));
    }
}
