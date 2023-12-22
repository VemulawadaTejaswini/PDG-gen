import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        String res = "NO";
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
 
        String[] words = { "maerd", "remaerd", "esare", "resare" };
        String judgeString = "";
 
        String[] sarray = S.split(""); 
 
        for (int i = sarray.length - 1; i >= 0; i--) {
            judgeString = judgeString + sarray[i];
            for (String word : words) {
                if (word.equals(judgeString)) {
                    judgeString = "";
                    if (i == 0) {
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