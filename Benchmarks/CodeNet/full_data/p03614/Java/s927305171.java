import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        String res = "";
        for (int i=0; i<n; i++) {
            a = sc.nextInt();
            if (a == i) {
                res += "X";
            } else {
                res += "O";
            }
        }
        if (n%2 != 0) {res += "O";}
        String pair = ""; int ans = 0;
        for (int i=0; i<res.length(); i+=2) {
            pair = res.substring(i, i+2);
            if (pair != "OO") {
                ans++;
            }        
        }
        System.out.println("ans");
    }

}
