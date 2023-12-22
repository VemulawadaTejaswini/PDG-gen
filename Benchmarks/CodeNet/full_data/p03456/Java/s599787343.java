import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        
        String num = "";
        for (String line: lines) {
            num += line;
        }

        if (isSquareNumber(Integer.parseInt(num))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSquareNumber(int number) {
        double sn = Math.sqrt(number);
        int num1 = (int)sn;
        if (sn - num1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
