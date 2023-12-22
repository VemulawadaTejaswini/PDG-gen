import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        char[] a = s.toCharArray();
        
        int c = 0;
        boolean check = false;
        for (int i=0; i < a.length; i++) {
            if (a[i] == '#') check = true;
            if (a[i] == '.' && check) c++;
        }
        
        System.out.println(c == a.length ? "0" : c);
    }
}
