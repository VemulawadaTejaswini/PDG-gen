import java.util.*;

public class Main {
    static class Counter implements Comparable<Counter> {
        int num = 0;
        int cnt = 0;

        Counter(int num) {
            this.num = num;
            cnt = 1;
        }

        public int compareTo(Counter o) {
            return o.cnt - cnt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Counter> counter1 = new ArrayList<>();
        List<Counter> counter2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();

            boolean isAdd = false;
            if (i % 2 == 0) {
                for (int j = 0; j < counter1.size(); j++) {
                    if (counter1.get(j).num == v) {
                        isAdd = true;
                        counter1.get(j).cnt++;
                    }
                }

                if (!isAdd) {
                    counter1.add(new Counter(v));
                }
            } else {
                for (int j = 0; j < counter2.size(); j++) {
                    if (counter2.get(j).num == v) {
                        isAdd = true;
                        counter2.get(j).cnt++;
                    }
                }

                if (!isAdd) {
                    counter2.add(new Counter(v));
                }
            }
        }

        Collections.sort(counter1);
        Collections.sort(counter2);

        int totalCnt1 = counter1.get(0).cnt;
        int totalNum1 = counter1.get(0).num;
        int totalCnt2 = counter2.get(0).cnt;
        int totalNum2 = counter2.get(0).num;
        for (int i = 1; i < counter2.size(); i++) {
            if (totalNum1 != totalNum2)
                break;
            if (counter1.get(i).num > counter2.get(i).num) {
                totalNum1 = counter1.get(i).num;
                totalCnt1 = counter1.get(i).cnt;
            } else {
                totalCnt2 = counter2.get(i).cnt;
            }
        }

        if (totalNum1 == totalNum2) {
            if (totalCnt1 > totalCnt2)
                totalCnt2 = 0;
            else
                totalCnt1 = 0;
        }

        System.out.println(n - (totalCnt1 + totalCnt2));
    }
}
