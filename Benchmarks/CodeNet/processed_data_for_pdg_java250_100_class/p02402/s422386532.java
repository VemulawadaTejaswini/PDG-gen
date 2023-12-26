public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scan.hasNext()){
			int x=scan.nextInt();
			ArrayList<Integer> list=new ArrayList<Integer>();
			long sum=0;
			for (int i = 0; i < x; i++) {
				int n=scan.nextInt();
				sum +=n;
				list.add(n);
			}
			System.out.println(Collections.min(list)+" "+Collections.max(list)+" "+sum);
		}
	}
}
