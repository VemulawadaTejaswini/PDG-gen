import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int match(String number , int [][] constraint){
        int n = constraint.length;
        int m = number.length();
        boolean [] checked = new boolean[m];
        int counter = 0;
        for(int i = 0; i < n; ++i){
            int pos = constraint[i][0];
            int digit = constraint[i][1];
            int value = number.charAt(pos) - '0';
            if(checked[pos] && digit != value){
                return -1;
            }
            if(digit == value){
                checked[pos] = true;
                ++counter;
            }
        }
        if(m > 1 && !checked[0]){
            return -1;
        }
        return counter;
    }
    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [][] constraint = new int[m][2];
        for(int i = 0; i < m; ++i){
            constraint[i][0] = input.nextInt() - 1;
            constraint[i][1] = input.nextInt();
        }
        int start = 0;
        if(n > 1) {
            start = (int) Math.pow(( double)10 , (double)(n - 1));
        }
        int end = (int)Math.pow((double)10 , (double)n);
        int maxCountMatch = -1;
        int answer = -1;
        for(int i = start; i <= end; ++i){
            int countMatch = match(Integer.toString(i), constraint);
            if(countMatch != -1){
                if(countMatch > maxCountMatch){
                    answer = i;
                    maxCountMatch = countMatch;
                }
                else
                if(countMatch == maxCountMatch){
                    if(i < answer){
                        answer = i;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
