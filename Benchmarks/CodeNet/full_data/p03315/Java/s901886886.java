
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String n;
        Scanner scan = new Scanner(System.in);
        n = scan.next();
        int ans = 0;
        for(int i = 0; i < n.length();i++){
            if(n.charAt(i)=='+')ans++;
            else ans--;
        }
        System.out.println(ans);
    }
}
