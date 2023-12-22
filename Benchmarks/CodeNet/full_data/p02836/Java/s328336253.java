import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0; i<s.length()/2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(s.length()-i-1);
            if(a != b) count++;
        }
        System.out.println(count);
    }
}
