import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        sc.close();

        String out = new String();
        for(int i=0; i<s.length; i++) {
            if(i % 2 == 0) {
                out += "" + s[i];
            }
        }
        System.out.println(out);
    }
}
