public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			int num = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			int answer = 0;
			for (int i = 0; i < num; i++) {
				list.add(Integer.valueOf(br.readLine()));
			}
			Collections.sort(list, Collections.reverseOrder());
			Integer mochiLen = 0;
			for (Integer integer : list) {
				if (!integer.equals(mochiLen)) {
					answer++;
					mochiLen = integer;
				}
			}
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
