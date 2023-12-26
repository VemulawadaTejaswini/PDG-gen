public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> hour=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int goukei=0;
		int hourdata=0;
		int result;
		int N=sc.nextInt();
		int M=sc.nextInt();
		for(int i=0;i<M;i++) {
			hour.add(sc.nextInt());
		}
		for(int i=0;i<hour.size();i++) {
			hourdata=hour.get(i);
			goukei+=hourdata;
		}
		if(goukei<=N) {
			result=N-goukei;
			System.out.println(result);
		}else {
			System.out.println(-1);
		}
	}
}
