import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        char[] input = scan.next().toCharArray();
        int[] alphaCount = new int[26];
        for(int i = 0; i < input.length; i++){
            alphaCount[(int)(input[i] - 'a')] += 1;
        }

        // calc
        Arrays.sort(alphaCount);

        // answer
        System.out.println((int)Math.ceil((input.length - alphaCount[25]) / 2.0));

    }
}