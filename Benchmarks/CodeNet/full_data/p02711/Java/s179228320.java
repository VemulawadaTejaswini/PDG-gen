import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char[] c = s.toCharArray();
        
        boolean is7 = (c[0]=='7') ||(c[1]=='7') ||(c[2]=='7');
        System.out.println(is7 ? "Yes" : "No");

    }

}
