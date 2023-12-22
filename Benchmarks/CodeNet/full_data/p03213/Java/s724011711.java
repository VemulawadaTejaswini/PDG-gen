import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = {2, 3, 5, 7, 11, 13, 17, 19, 23 ,29, 31, 37, 41, 43, 47};
		int[] num = new int[15];
		int c2 = 0;
		int c4 = 0;
		int c14 = 0;
		int c24 = 0;
		int c74 = 0;
		for(int i=0; i<15; i++){
			int t = n;
			while(t>0){
				t /= p[i];
				num[i] += t;
			}
			if(num[i]>=2){
				c2++;
			}
			if(num[i]>=4){
				c4++;
			}
			if(num[i]>=14){
				c14++;
			}
			if(num[i]>=24){
				c24++;
			}
			if(num[i]>=74){
				c74++;
			}
		}
		int ans = 0;
		if(c74>=1){
			ans += 1;
		}
		if(c14>=1 && c4>=2){
			ans += c14 * (c4-1);
		}
		if(c24>=1 && c2>=2){
			ans += c24 * (c2-1);
		}
		if(c4>=2 && c2>=3){
			ans += (c4*(c4-1))/2 * (c2-2);
		}
		System.out.println(ans);
	}
}