public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int natsuyasumi = sc.nextInt();
		int kazu = sc.nextInt();
		int shukudaiyaruhi = 0;
		for(int i=0 ; i<kazu ; i++) {
			int bangou = sc.nextInt();
			shukudaiyaruhi += bangou;
		}
		if(natsuyasumi-shukudaiyaruhi>=0) {
			System.out.print(natsuyasumi-shukudaiyaruhi);
		}
		else {
			System.out.print(-1);
		}
	}
}
