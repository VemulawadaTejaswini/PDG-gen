public class Main {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int a = ac.nextInt();
		int b = ac.nextInt();
		int c = ac.nextInt();
		int[] n = {a, b, c};
		int min = 10001;
		for (int i = 0; i < 3; i++){
			if ( n[i] <min){
				min = n[i];
			}
		}
		int max = 0;
		for (int i = 0; i < 3; i++){
			if ( n[i] > max){
				max = n[i];
			}
		}
		if (min < a && a < max){
			System.out.println(min +" " + a + " " + max);
		}else if (min < b && b < max){
			System.out.println(min +" " + b + " " + max);
		}else{
			System.out.println(min +" " + c + " " + max);
		}
	}
}
