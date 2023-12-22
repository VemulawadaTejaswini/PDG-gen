import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		double root_N = Math.sqrt((double)N);
		int root_N_kirisute = root_N_kirisute = (int)root_N;
		//a<b
		int a = 1;
		int b = 1;
		for(int i = root_N_kirisute; i>=2; i--){
			if(N%i == 0){
				a = i;
				b = (int)(N/i);
				break;
			}
		}
		int b_keta = (int)Math.log10((double)b) + 1;
		System.out.println(b_keta);
		
	}

}
