import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int sa = N - K + 1;
        int max = 0;
        int min = 1000000000;
        List<Integer> maxList = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();
        for (int i = 0; i < sa; i++) {
            maxList.add(max);
            minList.add(min);
        }
        for (int i = 0; i < N; i++) {
            int h = scanner.nextInt();
            if (max < h) {
                max = h;
            }
            if (min > h) {
                min = h;
            }
            if (minList.get(minList.size()-1) > h) {
                minList.remove(minList.size()-1);
                boolean flag = false;
                for (int j = minList.size()-1; j >= 0; j--) {
                    int temp = minList.get(j);
                    if (temp < h) {
                        minList.add(j+1, h);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    minList.add(0, h);
                }
            }
            if (maxList.get(maxList.size()-1) < h) {
                maxList.remove(maxList.size()-1);
                boolean flag = false;
                for (int j = maxList.size()-1; j >= 0; j--) {
                    int temp = maxList.get(j);
                    if (temp > h) {
                        maxList.add(j+1, h);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    maxList.add(0, h);
                }
            }
        }

        int ans1 = maxList.get(maxList.size()-1) - min;
        int ans2 = max - minList.get(minList.size()-1);

        if (ans1 < ans2) {
            System.out.println(ans1);
        } else {
            System.out.println(ans2);
        }
    }



}
