import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt(); // 材料の種類数
        int gram = sc.nextInt(); // 材料の総量
        int sum = 0; // 全ドーナツを1つずつ作る場合の必要材料
        int primal = 0; // ループ中で注目しているドーナツの必要材料
        int min = 1000; // ドーナツ一つを作る際の最少材料量

        for (int i=0; i < count; i++) {
        	primal = sc.nextInt();
        	sum = sum + primal;
        	if (min > primal) {
        		min = primal;
			}
        }
        System.out.println(calcMax(count, gram, min, sum));
    }

    public static int calcMax(int count, int gram, int min, int sum) {
		// まず１つずつドーナツを作る
		int total = count; // 作ることのできるドーナツの量
		gram = gram - sum;

		// 残った材料で、最も少ない材料で作ることができるドーナツ、を作れるだけ作る
		while(gram >= min) {
			gram = gram - min;
			total = total + 1;
		}
		return total;
	}

}
