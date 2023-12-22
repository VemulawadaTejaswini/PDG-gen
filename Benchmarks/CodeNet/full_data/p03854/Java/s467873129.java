import java.util.Scanner;

/**
 *
 * @author psygn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        String ans = "NO";
        rev = rev.replace("remaerd", "[space]");
        rev = rev.replace("resare", "[space]");
        rev = rev.replace("maerd", "[space]");
        rev = rev.replace("esare", "[space]");
        rev = rev.replace("[space]", "");
        if ("".equals(rev)){
            ans = "YES";
        }
        System.out.println(ans);
    }
}