import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int ans = 0;
        for(int i = 0; i < n.length(); i++) {
            if(n.chartAt(i) == '2') ans++;
        }
        System.out.println(ans);
    } 
}