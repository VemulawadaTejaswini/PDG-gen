import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        char s[] = inp.next().toCharArray();
        Arrays.sort(s);
        if (s[0] == s[1] && s[1] != s[2] && s[2] == s[3]) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
