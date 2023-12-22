import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sList = new String[n];
        for (int i = 1; i <= n; i++) sList[i-1] = Integer.toString(i);
        String s = String.join("", sList);

        String[] pList = new String[n];
        for (int i = 0; i < n; i++) pList[i] = sc.next();
        String p = String.join("", pList);

        String[] qList = new String[n];
        for (int i = 0; i < n; i++) qList[i] = sc.next();
        String q = String.join("", qList);

        List<String> list = new ArrayList<>();
        List<String> dict = permutation(list, s, "");

        int a = dict.indexOf(p) - 1;
        int b = dict.indexOf(q) - 1;

        System.out.println(Math.abs(a-b));
    }

    private static List<String> permutation(List<String> list, String q, String ans){
        if(q.length() <= 1) {
            list.add(ans+q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(
                        list,
                        q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
        return list;
    }
}