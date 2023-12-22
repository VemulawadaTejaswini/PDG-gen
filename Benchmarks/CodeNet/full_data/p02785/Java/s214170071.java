import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long monster_kensu = sc.nextLong();
		long kill_kaisu = sc.nextLong();

		if (monster_kensu <= kill_kaisu) {
			System.out.println("0");
		} else {
			long count = monster_kensu - kill_kaisu;
			List<Long> monster_list = new ArrayList<>();

			for (int i = 0; i < monster_kensu; i++) {
				monster_list.add(sc.nextLong());
			}

			Collections.sort(monster_list, Collections.reverseOrder());
          long attack_sum = 0;
          	if(count > 3){
				attack_sum = monster_list.stream().mapToLong(Long::longValue).skip(3).sum();
            } else {
              attack_sum = monster_list.stream().mapToLong(Long::longValue).skip(kill_kaisu).sum();
            }
          System.out.println(attack_sum);
		}
	}
}