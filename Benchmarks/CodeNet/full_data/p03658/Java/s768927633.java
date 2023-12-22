import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");
        String[] lss = sc.nextLine().split(" ");
        ArrayList<Integer> ls = new ArrayList<>();
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int ans = 0;
        for (int index = 0;index<n;index++) {
            ls.add(Integer.parseInt(lss[index]));
        }
        Collections.sort(ls);
        Collections.reverse(ls);
        for (int index = 0;index<k;index++) {
            ans += ls.get(index);
        }
        System.out.println(String.valueOf(ans));
    }
}