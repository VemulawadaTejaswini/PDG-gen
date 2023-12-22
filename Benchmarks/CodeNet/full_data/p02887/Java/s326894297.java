import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        ArrayList<Character> s_list = new ArrayList<Character>();
        s_list.add(s.charAt(0));
        int cnt = 0;
        
        for(int i=1; i<n; i++) {
            if(s_list.get(cnt) != s.charAt(i)) {
                s_list.add(s.charAt(i));
                cnt++;
            }
        }
        System.out.println(s_list.size());
    }
}