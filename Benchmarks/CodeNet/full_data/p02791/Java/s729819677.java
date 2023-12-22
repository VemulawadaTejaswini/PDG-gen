import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (line.equals("")) {
            line = scanner.nextLine();
        }
        int N = Integer.parseInt(line);
        line = scanner.nextLine();
        while (line.equals("")) {
            line = scanner.nextLine();
        }
        String[] nsText = line.split(" ");
        List<Integer> num = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            num.add(Integer.valueOf(nsText[i]));
        }
        for (int i = 1; i <= N; i++) {
            int justNum = num.get(i - 1);
            boolean doCount = true;
            for (int j = 1; j <= i; j++) {
                int getNum = num.get(j - 1);
                if (justNum > getNum) {
                    doCount = false;
                }
            }
            if (doCount) {
                count++;
            }
        }
        System.out.println(count);
    }

}