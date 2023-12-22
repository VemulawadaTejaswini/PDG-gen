import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int cnt = 0;
        if(s.contains("ABC")) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == 'A') {
                    if(i+1 < s.length() && s.charAt(i+1) == 'B') {
                        if(i+2 < s.length() && s.charAt(i+2) == 'C') {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
