import java.io.IOException;
import java.util.Scanner;

 class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "CODEFESTIVAL2016";
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s1.charAt(i) != s.charAt(i)) count = count +1;
        }
        System.out.println(count);
    }
}
