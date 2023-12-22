import java.util.*;

public class Main {
    public static void main(String[] args) {
        String res = "NO";
        Scanner sc = new Scanner(System.in);
        String S = "dreamer";// sc.nextLine();
        sc.close();

        String[] words = { "maerd", "remaerd", "esare", "resare" };
        String judgeString = "";

        String[] sarray = S.split("");
        String[] sArray = new String[sarray.length];
        int k = 0;
        for (int j = sarray.length - 1; j >= 0; j--) {
            sArray[k] = sarray[j];
            k++;
        }

        String T = "";

        for (int i = 0; i < sArray.length; i++) {
            judgeString = judgeString + sArray[i];
            for (String word : words) {
                if (word.equals(judgeString)) {
                    judgeString = "";
                    if (sArray.length - 1 - i == 0) {
                        res = "YES";
                    }
                    break;
                }
            }
        }
        System.out.println(res);
        System.gc();
    }
}