import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String paramS[] = scanner.nextLine().split("");
        String paramT[] = scanner.nextLine().split("");
        scanner.close();

        ArrayList<String> sa = new ArrayList(Arrays.asList(paramS));
        int currentSIndex = -1;
        int currentRow = 0;
        int result = 0;

        outside: for (String t: paramT) {
            int i = sa.indexOf(t);
            if (i == -1) {
                result = -1;
                break;
            } else {
                if (currentSIndex > i) {
                    currentRow += 1;
                } else if (currentSIndex == i) {
                    for (int j = currentSIndex + 1; j < paramS.length; j++) {
                        if (sa.get(j) == t) {
                            currentSIndex = j;
                            continue outside;
                        }
                    }
                    currentRow += 1;
                }
                currentSIndex = i;
            }
        }

        if (result != -1) result = paramS.length * currentRow + currentSIndex + 1;

        System.out.println(result);
    }
}