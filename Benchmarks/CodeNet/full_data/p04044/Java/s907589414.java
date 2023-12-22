
import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, l;
        n = in.nextInt();
        l = in.nextInt();
        in.nextLine();
        String input;
        String words[] = new String[n];

        for (int i =0; i<n ;i++){
            input = in.nextLine();
            words[i] = input;
        }
        Arrays.sort(words);
        String joinedWord = String.join("",words);
        System.out.println(joinedWord);

    }
}