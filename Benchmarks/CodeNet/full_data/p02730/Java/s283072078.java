import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0; i<s.length()/2; i++) {
            String s1 = s.substring(i, i+1);
            String s2 = s.substring(s.length() -i -1, s.length() -i);
            if(!s1.equals(s2)) {
                System.out.println("No");
                return;
            }
        }
        String s3 = s.substring(0,(s.length() -1) /2);
        for(int i=0; i<s3.length()/2; i++) {
            String s1 = s3.substring(i, i+1);
            String s2 = s3.substring(s3.length() -i -1, s3.length() -i);
            if(!s1.equals(s2)) {
                System.out.println("No");
                return;
            }
        }
        String s4 = s.substring((s.length() +1) /2, s.length());
        for(int i=0; i<s4.length()/2; i++) {
            String s1 = s4.substring(i, i+1);
            String s2 = s4.substring(s4.length() -i -1, s4.length() -i);
            if(!s1.equals(s2)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}