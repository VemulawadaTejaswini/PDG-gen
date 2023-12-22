import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String input = sc.nextLine();
		String As[] = input.split(" ");

		if(Integer.parseInt(As[M-1]) >= N/(4*M) ){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

		// String input = sc.nextLine();
	  // String nums[] = input.split(" ");

	  // long A = Long.parseLong(nums[0]);
	  // long B = Long.parseLong(nums[1]);
	  // long sum = Long.parseLong(nums[2]);

		// System.out.println(S.toString());

	}
}