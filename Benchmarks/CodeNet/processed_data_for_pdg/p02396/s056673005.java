public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == 0) break;
			cnt++;
			System.out.println("Case " + cnt + ": " + num);
		}
		sc.close();
	}
}
