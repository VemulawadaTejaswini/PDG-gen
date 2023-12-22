import java.util.Scanner;

/**
 * Created by wild on 2016/07/23.
 */
public class Main {
    public static void main(String[] args) {
        //入力
        Scanner scan = new Scanner(System.in);
        String money = scan.next();

        int num = scan.nextInt();
        String[] hate = new String[num];
        for (int i = 0; i < hate.length; i++) {
            hate[i] = scan.next();
        }

        while (check(money, hate)){
            Integer tmp = Integer.parseInt(money);
            tmp++;
            money = tmp.toString();
        }
        System.out.println(money);
    }

    private static boolean check(String str, String[] nums){
        for (int i = 0; i < nums.length; i++){
            if (str.indexOf(nums[i]) != -1) return true;
        }
        return false;
    }
}