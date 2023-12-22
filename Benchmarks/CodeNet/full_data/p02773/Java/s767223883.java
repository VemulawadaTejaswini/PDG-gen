import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		List<String> words = new LinkedList<>();
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		String temp = " ";
		for (int i = 0; i < N; i++) {
			temp = sc.next();
			if (!words.contains(temp)) {
				words.add(temp);
				count.put(temp, 1);
			} else {
				int t = count.get(temp);
				count.replace(temp, t + 1);
			}
		}
		int base = count.get(words.get(0));
		for (int i = 0; i < words.size(); i++)
			for (int j = 0; j < words.size(); j++) {
				temp = words.get(j);
				if (base > count.get(temp)) {
					count.remove(temp);
					words.remove(j);
					i--;
				} else if (base < count.get(temp)) {
					base = count.get(temp);
				}
			}
		words.forEach(a -> System.out.println(a));
	}
}