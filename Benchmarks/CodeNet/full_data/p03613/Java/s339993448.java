import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N == 1) {
            System.out.println("1");
            return;
        }

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(scanner.next()));
        }

        a.sort(Comparator.reverseOrder());

        String str = "";
        for (int i = 0; i < N - 1; i++) {
            str += a.get(i) - a.get(i+1);
        }

        int count = 1;
        int maxCount = 1;
        int before = 9;

        for (int i = 0; i < N - 1; i++) {
            String tmp = str.substring(i, i+1);
            if (tmp.equals("1")) {
                if (before == 1) {
                    count = 3;
                } else if (before == 0) {
                    count++;
                } else {
                    count = 2;
                }
            } else if (tmp.equals("0")) {
                if (before == 0 || before == 1) {
                    count++;
                }
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
            }

            before = Integer.parseInt(tmp);
        }

        System.out.println(count);


    }
}
