import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine(); //"cdefghnoprstuvwxy"; //sc.nextLine();
        absAlpha(alphabets , input);
    }

    private static void absAlpha(String alphabets, String input) {
        HashSet<Character> inputset = new HashSet<>();
        for (int i=0; i<alphabets.length(); i++){
            String str = String.valueOf(alphabets.charAt(i));
            if (!input.contains(str))
                inputset.add(alphabets.charAt(i));
        }
        if (inputset.isEmpty())
            System.out.println("None");
        else {
            for (char c : inputset)
                System.out.print(c);
        }

    }
}
