public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int EndNum = 0;
		while(true){
			int x = sc.nextInt();
			if( EndNum == x){
				break;
			}
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}
