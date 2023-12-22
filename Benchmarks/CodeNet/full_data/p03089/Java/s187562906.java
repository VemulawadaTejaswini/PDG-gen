
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] b = new int[N];
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		List<Pair> stack = new ArrayList<>();
		String ans = "";
		for(int i = N - 1; i > -1; i--) {
			if(b[i] > i + 1) {
				ans = "-1";
				break;
			} else {
				if(b[i] == 1) {
					ans += "1\n";
					stack.forEach(entry -> entry.setCount(entry.getCount() - 1));
					boolean flag = true;
					while(!stack.isEmpty() && flag) {
						flag = false;
						for(int j = 0; j < stack.size(); j++) {
							if(stack.get(j).getCount() <= 0) {
								ans += stack.get(j).getNum() + "\n";
								stack.remove(j);
								for(int k = 0; k < j; k++) {
									stack.get(k).setCount(stack.get(k).getCount() - 1);
								}
								flag = true;
								break;
							}
						}
					}
				} else {
					stack.add(new Pair(b[i]));
				}
			}
		}
		System.out.println(ans);
	}
}

class Pair {
	int num;
	int count;

	protected Pair(int num) {
		super();
		this.num = num;
		this.count = num - 1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Pair [num=" + num + ", count=" + count + "]";
	}

}
