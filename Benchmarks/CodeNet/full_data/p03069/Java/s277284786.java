import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '#') {
                i++;
                while(i < n && s.charAt(i) == '.') {
                    count++;
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
