import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String line = sc.nextLine();
        check(num, line);
    }

    public static void check(String num, String line) {
        String[] strs = line.split(" ");
        int cnt=0;
        for (int i=1; i<strs.length-1; i++) {
            if(Integer.parseInt(strs[i-1]) < Integer.parseInt(strs[i]) &&
                    Integer.parseInt(strs[i]) < Integer.parseInt(strs[i+1]) ||
            Integer.parseInt(strs[i-1]) > Integer.parseInt(strs[i]) &&
                    Integer.parseInt(strs[i]) > Integer.parseInt(strs[i+1])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}