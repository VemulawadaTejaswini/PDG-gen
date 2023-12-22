import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int maxLength = str.length();
        String[] ar = str.split("");

        boolean flag = false;
        for(int i=0; i < maxLength; i++) {
            if(ar[0].equals(ar[i]) != true) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
