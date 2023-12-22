import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        boolean[] hits = new boolean[9];

        for(int i = 0 ; i < 9 ; i++){
            numbers.add(scanner.nextInt());
            hits[i] = false;
        }

        int n = scanner.nextInt();
        boolean isBingo = false;
        for(int i = 0 ; i < n ; i++){
            int b = scanner.nextInt();
            if(numbers.contains(b)){
                int idx = numbers.indexOf(b);
                hits[idx] = true;
            }

            if(i % 5 == 0){
                isBingo = isBingo(hits);
                if(isBingo){
                    break;
                }
            }
        }
        if(!isBingo){
            isBingo = isBingo(hits);
        }

        System.out.println(isBingo ? "Yes" : "No");
    }

    private static boolean isBingo(boolean[] hits) {
        //012,345,678
        for(int i = 0 ; i < 3 ; i++){
            if(hits[3 * i + 0] && hits[3 * i + 1] && hits[3 * i + 2]){
                return true;
            }
        }
        //036, 147, 258
        for(int i = 0 ; i < 3 ; i++){
            if(hits[i + 0] && hits[i + 3] && hits[i + 6]){
                return true;
            }
        }
        //048
        if(hits[0] && hits[4] && hits[8]){
            return true;
        }
        //246
        if(hits[2] && hits[4] && hits[6]){
            return true;
        }
        return false;
    }
}
