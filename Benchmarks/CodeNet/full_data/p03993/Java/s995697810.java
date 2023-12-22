import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int count = 0;
		Rabbit[] rab = new Rabbit[100000];

		int j = 1;
		for (int i = 0; i < total; i++) {
			rab[i] = new Rabbit(sc.nextInt(), j);
			j++;
		}

		for (int i = 0; i < total; i++) {
			int tempIdx = rab[i].number;
			int tempNum = rab[i].index;
			if (rab[i].number == rab[tempIdx-1].index && rab[i].index == rab[tempIdx-1].number && rab[i].index < rab[tempIdx-1].index)
				count++;
		}

		System.out.println(count);
	}
}

class Rabbit {
	int number;
	int index;

	public Rabbit(int num, int idx) {
		this.number = num;
		this.index = idx;
	}

	public int getNumber() {
		return number;
	}

	public int getIndex() {
		return index;
	}

}