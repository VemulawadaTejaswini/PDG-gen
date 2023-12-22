import java.util.*;
public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int count = 0;
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        List<Integer> aList = new ArrayList<>();
        while (true) {
            count++;
            List<Integer> tmpList = list.subList(0, K);
            Optional<Integer> tmpMin = tmpList.stream().min(Comparator.naturalOrder());
            tmpList.forEach(i -> i = tmpMin.get());
            for (int i = 0; i<list.size() - 1; i++) {
                aList.add(tmpList.get(i));
            }
            aList.add(list.get(list.size() - 1));
            if (list.stream().allMatch(i -> i.equals(min.get()))) {
                break;
            }
        }

        System.out.println(count);
    }
}