import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char b = scan.next().charAt(0);

        System.out.println(b);
        char[] c = new char[128];
        c['A'] = 'T';
        c['C'] = 'G';
        c['G'] = 'C';
        c['T'] = 'A';

        System.out.println(c[b]);
    }
}
