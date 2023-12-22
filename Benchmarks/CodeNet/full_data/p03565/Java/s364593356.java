import java.util.Scanner;

public class Main {

    public static void main(String[] argv){

        Scanner scan = new Scanner(System.in);

        String ss = scan.nextLine();
        String t = scan.nextLine();

        StringBuilder s = new StringBuilder(ss);

        boolean already = false;

    for (int i = s.length() - 1 - t.length(); i >= 0 && !already; i--) {


        boolean possible = true;

        for (int j = 0; j < t.length() && possible; j++) {

            if (s.charAt(i + j) != t.charAt(j) && s.charAt(i + j) != '?') {
                possible = false;
            }
        }

        if (possible) {
            for (int j = 0; j < t.length(); j++) {
                s.setCharAt(i + j, t.charAt(j));
            }
            already = true;
        }

    }


    // ? -> a
    if (already) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                s.setCharAt(i, 'a');
            }
        }
        System.out.println(s);
    } else {
        System.out.println("UNRESTORABLE");
    }



    }

}
