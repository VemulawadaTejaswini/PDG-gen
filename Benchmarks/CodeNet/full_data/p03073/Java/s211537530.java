import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count1 = 0;
        int count2 = 0;
        
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            
            if (i % 2 == 0) {
                if (s.equals("0")) {
                    count1++;
                }
            } else {
                if (s.equals("1")) {
                    count1++;
                }
            }
        }
        
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            
            if (i % 2 == 1) {
                if (s.equals("0")) {
                    count2++;
                }
            } else {
                if (s.equals("1")) {
                    count2++;
                }
            }
        }
        
        int answer = Math.min(count1, count2);
        System.out.println(answer);
    }
}