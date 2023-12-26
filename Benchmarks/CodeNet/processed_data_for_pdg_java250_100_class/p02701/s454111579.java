public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String aaa = sc.next();
		Map<String, String> prizeMap = new HashMap<>();
		prizeMap.put(aaa,aaa);
		for(int i = 1;i < N; i++) {
			String prize = sc.next();
			if(prizeMap.containsKey(prize)) {
			}else {
				prizeMap.put(prize, prize);
			}
		}
		sc.close();
		System.out.println(prizeMap.size());
	}
}
