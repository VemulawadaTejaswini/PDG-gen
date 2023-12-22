import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int hundreds = n / 100;
        int tens = (n / 10) % 10; // (n % 100) / 10
        int ones = n % 10;

        //System.out.println("【" + n + "】の各位の数");
       // System.out.println("百の位 : " + hundreds);
        //System.out.println("十の位 : " + tens);
        //System.out.println("一の位 : " + ones);
        while (true){
            if(hundreds/7==1){
                System.out.println("Yes");
                break;
            }
            if (tens/7==1){
                System.out.println("Yes");
                break;
            }
            if (ones/7==1){
                System.out.println("Yes");
                break;
            }
            else {
                System.out.println("No");
                break;
            }
        }
    }
}
