import java.util.Scanner;

class ABC099C {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int six = 0;
		int nine = 0;
		int sum = 0;
		int count = 0;
		int ans = 10000;

		
		for(int i = 0;i <= N;i++){
			six = i;
			nine = N - i;

			while(six > 0){
				count += six % 6;
				six /= 6;
			}

			while(nine > 0){
				count += nine % 9;
				nine /= 9;
			}

			if(count < ans){
				ans = count;
			}
			count = 0;

		}

		System.out.println(ans);

	}
}

