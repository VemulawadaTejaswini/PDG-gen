import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        String arr[] = mylist.get(0).split(" ");
        int n = Integer.valueOf(arr[0]);
        String s = mylist.get(1);

        int cnt = 0;
        int sposi = 0;

        while (sposi < s.length()) {

            int bidx = s.indexOf("#", sposi);

            if (bidx >= 0) {
                sposi = bidx + 1;
                int widx = s.indexOf(".", sposi);

                if (widx >= 0) {
                    sposi = widx + 1;
                    int bcnt = widx - bidx;
                    int bidx2 = s.indexOf("#", sposi);

                    if (bidx2 >= 0) {
                        //int l = bidx2 - bidx;
                        //                        System.out.println(l + " " + bidx2 + " " + bidx);
                        sposi = bidx2 + 1;
                        int wcnt = bidx2 - widx;
                        //                        System.out.println(bcnt + " " + wcnt);

                        cnt += Math.min(bcnt, wcnt);
                    } else {
                        int wcnt = n - bcnt;
                        //                        System.out.println(bcnt + " " + wcnt);
                        cnt += Math.min(bcnt, wcnt);
                        break;
                    }

                }

            }

        }
        System.out.println(cnt);

    }

}
