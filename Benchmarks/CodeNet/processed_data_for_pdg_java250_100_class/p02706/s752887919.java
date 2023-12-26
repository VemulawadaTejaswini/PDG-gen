public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int natsuyasumi = sc.nextInt();
		int shukudai = sc.nextInt();
		for(int i=0 ; i<shukudai ; i++) {
			int bangou = sc.nextInt();
			natsuyasumi -= bangou;
		}
		if(natsuyasumi>=0) {
			System.out.print(natsuyasumi);
		}
		else {
			System.out.print(-1);
		}
	}
}
