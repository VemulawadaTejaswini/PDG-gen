import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();

        char[] alphabet = new char[26];
        char a = 'a';
        for (int i = 0; i < 26; i++) alphabet[i] = a++;
        
        String s = String.valueOf(alphabet);
        
        System.out.println(alphabet[s.indexOf(c)+1]);
    }
}