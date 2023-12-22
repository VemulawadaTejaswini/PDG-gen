import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] tokens = new char[n];
        String toks = scanner.next();

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = toks.charAt(i);
        }

        int ans = 0;

        int i = 0;
        while (i <= tokens.length - 3) {
            if (i + 4 < tokens.length && isDispute(i, tokens)){
                ans += dispute(i, i + 2, tokens);
                i += 4;
            }
            else if (isOneZeroOne(i, tokens)){
                ans += dispute(i, i, tokens);
                i += 2;
            }
            else i++;

//            System.out.println(Arrays.toString(tokens));
        }

        System.out.println(ans);
    }

    private static int dispute(int first0, int second0, char[] tokens){
        int index = first0;
        int leftCount = 0;
        int rightCount = 0;

        while (index >= 0 && tokens[index] == '1'){
            leftCount++;
            index--;
        }

        index = second0 + 2;
        while (index < tokens.length && tokens[index] == '1'){
            rightCount++;
            index++;
        }

        if (first0 == second0){
            if (leftCount >= 0){
                modArray(first0 + 2, false, first0 - leftCount + 1, tokens);
            }
            else {
                modArray(second0, true, second0 + 2 + rightCount - 1, tokens);
            }
        }
        else {
            if (leftCount >= 0){
                modArray(first0 + 2, false, first0 - leftCount + 1, tokens);
            }
            else {
                modArray(second0, true, second0 + 2 + rightCount - 1, tokens);
            }
        }
        return leftCount >= rightCount?leftCount:rightCount;
    }

    private static boolean isDispute(int index, char[] tokens){
        return  (tokens[index] == '1' && tokens[index + 1] == '0' && tokens[index + 2] == '1' && tokens[index + 3] == '0' && tokens[index + 4] == '1');
    }

    private static boolean isOneZeroOne(int index, char[] tokens){
        return  (tokens[index] == '1' && tokens[index + 1] == '0' && tokens[index + 2] == '1');
    }

    private static void modArray(int index, boolean direction, int last, char[] tokens){
        if (direction){
            tokens[last] = '0';
            tokens[last - 1] = '1';
            for (int i = index; i < last - 1; i++) {
                tokens[i] = '0';
            }
        }
        else {
            tokens[last] ='0';
            tokens[last + 1] = '1';
            for (int i = last + 2; i < index + 1; i++) {
                tokens[i] = '0';
            }
        }
    }
}
