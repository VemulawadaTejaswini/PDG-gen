import java.util.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vStr = sc.nextLine();
        Map<Integer, Integer> vList = str2List(vStr);

        int n = vList.get(0);
        int k = vList.get(1);

        String s = sc.nextLine();
        String sArr[] = s.split("");

        switch (sArr[k-1]) {
            case "A":
                sArr[k-1] = "a";
                break;
            case "B":
                sArr[k-1] = "b";
                break;
            case "C":
                sArr[k-1] = "c";
                break;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sArr[i]);
        }
    }

    static Map<Integer, Integer> str2List(String str) {
        String[] vArrStr = str.split(" ");

        Map<Integer, Integer> ret = new HashMap<>();
        Integer key = 0;
        for (String val:vArrStr) {
            ret.put(key, Integer.valueOf(val));
            key++;
        }

        return ret;
    }
}
