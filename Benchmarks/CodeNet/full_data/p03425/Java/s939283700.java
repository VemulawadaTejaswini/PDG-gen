import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = {0, 0, 0, 0, 0};

		for(int i = 0; i < n; i++) {
			String str = sc.next();
			switch(str.charAt(0)) {
			case 'M': nums[0]++; break;
			case 'A': nums[1]++; break;
			case 'R': nums[2]++; break;
			case 'C': nums[3]++; break;
			case 'H': nums[4]++; break;
			}
		}

		int type = 0;
		for(int i = 0; i < 5; i++) {
			if(nums[i] != 0)
				type++;
		}

		if(type < 3)
			System.out.println(0);
		else if(type == 3) {
			long cnt = 1;
			for(int i = 0; i < 5; i++) {
				if(nums[i] != 0)
					cnt*=nums[i];
			}
			System.out.println(cnt);
		} else {
			long cnt = 0;
			for(int i = 0; i < 5; i++) {
				if(nums[i] == 0) continue;
				long buf= 0;
				if(type == 4)
					buf = 1;
				else if(type == 5)
					buf = 4;
				for(int j = 0; j < 5; j++) {
					if(i == j) continue;
					if(nums[j] != 0)
						buf *= nums[j];
				}
				cnt += buf;
			}
			System.out.println(cnt);
		}
	}
}
