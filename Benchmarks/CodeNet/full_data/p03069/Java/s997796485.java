import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int changed = n;

        for (int i = 0; i < n ; i++) {
            // 境界より前
            String s1 = s.substring(0,i+1);
            // 後ろ
            String s2 = s.substring(i+1);

            int dotCnt = 0;
            int sharpCnt = 0;

            for (int j = 0; j < s1.length(); j++) {
                if(String.valueOf(s1.charAt(j)).equals("#")) {
                    sharpCnt++;
                }
            }
            for (int j = 0; j < s2.length(); j++) {
                if(String.valueOf(s2.charAt(j)).equals(".")) {
                    dotCnt++;
                }
            }
            if (changed > sharpCnt + dotCnt) {
                changed = sharpCnt + dotCnt;
            }
        }

        System.out.println(changed);
        sc.close();
    }
}