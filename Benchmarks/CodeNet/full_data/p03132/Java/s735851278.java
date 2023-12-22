import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] stones = new int[l];
		int[] stones2 = new int[l];
		for(int i=0; i<l; i++){
			stones[i] = sc.nextInt();
			stones2[i] = stones[i] % 2;
		}
		
		int s = 0;
		int e = l-1;
		for(int i=1; i<l-1; i++){
			if(stones[i] == 0){
				int zeronum = 0;
				int j = i;
				while(stones[j] == 0){
					zeronum++;
					j++;
				}
				int before = getsnum(stones, 0, i);
				int after = getsnum(stones, j, l-1);
				int[] stonesc = stones;
				for(int k=i; k<j; k++){
					stonesc[k]++;
				}
				int cscore = getscore(stonesc);
				if(zeronum >= before){
					ans = before;
					s = j;
				}
				else if(zeronum >= after){
					ans = after;
					e = j;
				}
				else{
					ans += zeronum;
					for(int k=i; k<j; k++){
						stones[k]++;
					}
				}
			}
		}
		
		int[] stones3 = new int[e-s+1];
		for(int i=0; i<=e-s; i++){
			stones3[i] = stones2[i+s];
		}
		ans += getscore(stones3);
		
		System.out.println(ans);
	}
	
	public static int getscore(int[] stones){
		int allodd = 0;
		int maxodd = 0;
		int odd = 0;
		for(int i=0; i<stones.length; i++){
			if(stones[i] == 1){
				allodd++;
				odd++;
			}
			else{
				if(maxodd < odd){
					maxodd = odd;
				}
				odd = 0;
			}
		}
		if(maxodd < odd){
			maxodd = odd;
		}
		return allodd - maxodd;
	}
	
	public static int getsnum(int[] stones, int s, int e){
		int num = 0;
		for(int i=s; i<=e; i++){
			num += stones[i];
		}
		return num;
	}
}
