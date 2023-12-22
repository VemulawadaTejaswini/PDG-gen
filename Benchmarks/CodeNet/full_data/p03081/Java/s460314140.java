import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ExaWizardsCBetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        String s = scanner.next();
        int left = 0;
        int right = s.length() - 1;

        ArrayList<Character> indexes = new ArrayList<>();
        ArrayList<Character>  directions = new ArrayList<>();
        for(int i = 0; i < Q; i++){
            char index = scanner.next().charAt(0);
            char direction = scanner.next().charAt(0);
            indexes.add(index);
            directions.add(direction);
        }

        for(int j = Q - 1; j >= 0; j--){
            char atLeft = s.charAt(left);
            char atRight = s.charAt(right);
            char moveI = indexes.get(j);
            char moveD = directions.get(j);
            if(moveI == atLeft && moveD == 'L'){
                left++;
            }

            if(moveI == atRight && moveD == 'R'){
                right--;
            }
        }

        System.out.println(right - left + 1);

    }
}
