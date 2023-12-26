public class Main {
	public static void main(String args[]) throws NumberFormatException{
		Scanner scan = new Scanner(System.in);
		long sum;
		int n;
		n = scan.nextInt();
		sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int count = 0; count < n ; count++){
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		for(int i =0;i < list.size();i++){
			sum = sum + list.get(i);
		}
		System.out.println(String.valueOf(list.get(0)) + " " + String.valueOf(list.get(n-1)) + " " + String.valueOf(sum));
	}
}
