public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int intCount = 0;
		if(a < b){
			for(int i = a; i <= b; i++){
				if(c % i == 0){
					intCount++;
				}
			}
			System.out.println(intCount);
		}else{
			for(int i = b; i <= a; i++){
				if(c % i == 0){
					intCount++;
				}
			}
			System.out.println(intCount);
		}
	}
}
