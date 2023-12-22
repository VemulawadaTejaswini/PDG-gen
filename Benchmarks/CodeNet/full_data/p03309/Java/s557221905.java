import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> totalList = new ArrayList<>();
        for (int b = 0; b < N + 1; b++) {
            int total = 0;
            for (int i = 0; i < list.size(); i++) {
                total = total + Math.abs(list.get(i) - (b + (i + 1)));
            }
            totalList.add(total);
            int total2 = 0;
            for (int i = 0; i < list.size(); i++) {
                total2 = total2 + Math.abs(list.get(i) - (-b + (i + 1)));
            }
            totalList.add(total2);
        }

        System.out.println(Collections.min(totalList));
    }
}