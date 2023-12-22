import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean eol = false;

        int count = sc.nextInt(); // 材料の種類数
        int gram = sc.nextInt(); // 材料の総量

        List<Integer> costs = new ArrayList<>();

        for (int i=0; i < count; i++) {
            costs.add(sc.nextInt());
        }

        System.out.println(calcMax(count, gram, costs));
    }

    public static int calcMax(int count, int gram, List<Integer> costs) {

        // 最小の必要材料量を取得
        Optional<Integer> minObj = costs.stream().min(Comparator.naturalOrder());
        int min = minObj.get();

        // 全てのドーナツを一つずつ作る場合の必要材料量
        int sum = costs.stream().mapToInt(Integer::intValue).sum();

        // 作ることのできるドーナツの量
        int total = 0;

        // まず１つずつドーナツを作る
        total = count;
        gram = gram - sum;

        // 残った材料で、最も少ない材料で作ることができるドーナツを作る
        while(gram >= min) {
            gram = gram - min;
            total = total + 1;
        }

        return total;
    }


}
