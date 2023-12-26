public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flg = false;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		while(true) {
			C = C - B;
			if(C <= 0) {
				break;
			}
			A = A - D;			
			if(A <= 0) {
				flg = true;
				break;
			}
		}
		if(flg) {
			System.out.println("No");						
		}else {
			System.out.println("Yes");									
		}
	}
}
