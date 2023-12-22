import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String nums = sc.nextLine();
		String num[] = nums.split(" ");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		String inputs = sc.nextLine();
		String input[] = inputs.split(" ");
//		String input = sc.nextLine();
//		System.out.println(input);
//		String As[] = input.split(" ");

		int count = 0;
		int sum = 0;
		for(int i = 0;i < N;i++){
			sum += Integer.parseInt(input[i]);
		}
		//System.out.println("sum = " + sum);

		int popular = sum / (4 * M);
		//System.out.println("popular = " + popular);
		//popular = (sum % (4 * M) == 0)?popular - 1:popular;
		//System.out.println("popular = " + popular);
		for(int i = 0;i < N;i++){
			if(Integer.parseInt(input[i]) >= popular){
				count++;
			}
		}

		if(count >= M){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}