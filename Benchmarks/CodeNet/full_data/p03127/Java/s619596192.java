import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < num; i++)nums[i] = sc.nextInt();
        int ans = nums[0];
        
        for(int i = 1; i < num; i++) {
            ans = Divisor.gcd(ans, nums[i]);
        }

		System.out.println(ans);
	}
}

class Divisor{
    public static int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a%b);
    }
}

