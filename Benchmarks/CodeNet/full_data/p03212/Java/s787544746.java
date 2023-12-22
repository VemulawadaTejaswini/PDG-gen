import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] array = {"3","5","7"};
        List<String> rs = new ArrayList<>();
        addNumsComination(rs, array, "", n.length());
        int cnt = 0;
        int ni = Integer.parseInt(n);
        for (String s : rs) {
            if (s.contains("3") && s.contains("5") && s.contains("7")) {
                if (ni >= Integer.parseInt(s))
                    cnt++;
            }
        }
        System.out.println(cnt);
    }

    static void addNumsComination(List<String> r, String[] nums, String s, int digit) {
        for (int i = 0; i < nums.length; i++) {
            if (digit > 1) {
                addNumsComination(r, nums, s + nums[i], digit - 1);
            }
            r.add(s + nums[i]);
        }
    }
}
