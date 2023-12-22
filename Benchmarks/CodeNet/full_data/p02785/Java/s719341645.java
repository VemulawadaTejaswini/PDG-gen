
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long monsterNumber = scan.nextLong(); // モンスターの数
		long countSPATK = scan.nextLong(); // 必殺技の使用可能回数
		List<Long> listMonsterHP = new ArrayList<Long>(); // monsterのHPリスト
		for(int i = 0; i < monsterNumber; i++) {
			listMonsterHP.add(scan.nextLong());
		}

		scan.close();

		if (monsterNumber < countSPATK) {
			System.out.println(0);
			return;
		}

		for(int i = 0; i < listMonsterHP.size(); i++) {
			for(int j = i + 1; j < listMonsterHP.size() - 1; j++) {
				if(listMonsterHP.get(i) < listMonsterHP.get(j)) {
					long tmp = listMonsterHP.get(i);
					listMonsterHP.set(i, listMonsterHP.get(j));
					listMonsterHP.set(j, tmp);
				}
			}
		}

		// 必殺技を使って倒す
//		for(; countSPATK > 0; countSPATK--) {
//			int index = 0;
//			for(int j = 0; j < listMonsterHP.size(); j++) {
//				if (listMonsterHP.get(index) < listMonsterHP.get(j)) {
//					index = j;
//				}
//			}
//			listMonsterHP.set(index, 0l);
//		}

		// 通常攻撃を使って倒す
		long countActionMin = 0; // 必殺技は含めない
		for(int i = (int) countSPATK; i < listMonsterHP.size(); i++) {
			countActionMin += listMonsterHP.get(i);
		}
		System.out.println(countActionMin);
	}
}
