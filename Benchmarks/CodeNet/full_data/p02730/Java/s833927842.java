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

        String s = mylist.get(0);
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring((s.length() / 2) + 1, s.length());
        String stemp1 = s1.substring(0, s1.length() / 2);
        String stemp2 = s1.substring((s1.length() / 2) + 1, s1.length());

//        System.out.println(s1 + " " + s2 + " " + stemp1 + " " + stemp2);

        Boolean chkflg = false;
        if (s1.equals(s2)) {
            if (stemp1.equals(stemp2)) {
                chkflg = true;
            }

        }
        System.out.println(chkflg ? "Yes" : "No");
    }

}
