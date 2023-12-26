public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> len = new LinkedList<Integer>();
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			len.add(scan.nextInt());
		}
		Collections.sort(len, Comparator.reverseOrder());
		int maxLen = len.poll();
		int sum = 0;
		while(len.size() > 0){
			sum += len.poll();
		}
		if(maxLen < sum){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
