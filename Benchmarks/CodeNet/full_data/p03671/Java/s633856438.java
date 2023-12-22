
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[3];


		for(int i = 0; i < 3; i++){
			nums[i] = sc.nextInt();
		}

		int tmp1 = nums[0] + nums[1];
		int tmp2 = nums[1] + nums[2];
		int tmp3 = nums[0] + nums[2];

		if(tmp1 >= tmp2 && tmp1 >= tmp3) System.out.println(tmp1);
		else if(tmp2 >= tmp1 && tmp2 >= tmp3) System.out.println(tmp2);
		else if(tmp3 >= tmp2 && tmp3 >= tmp1) System.out.println(tmp1);

	}

}
