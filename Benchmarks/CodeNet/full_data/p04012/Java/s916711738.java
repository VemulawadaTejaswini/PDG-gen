
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] chs = sc.next().toCharArray();
        boolean[] isOdds = new boolean[26];

        for(char ch: chs) {
            int index = ch - 'a';
            isOdds[index] = !isOdds[index];
        }

        boolean isNotBeautiful = false;

        for(boolean isOdd: isOdds) {
            isNotBeautiful |= isOdd;
        }

        if(!isNotBeautiful) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}