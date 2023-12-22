import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int swordNum = sc.nextInt();
		int hitPoint = sc.nextInt();
		int[] swordPoints = new int[swordNum];
		int[] throwPoints = new int[swordNum];
		for(int i = 0; i < swordNum; i++) {
			swordPoints[i] = sc.nextInt();
			throwPoints[i] = sc.nextInt();
		}
		int ans = 0;
		boolean[] thrown = new boolean[swordNum + 1];
		Arrays.fill(thrown, 0, swordNum, false);
		
		int useSword = swordNum;
		int[] attack = new int[swordNum+1];
		while(hitPoint > 0) {
			Arrays.fill(attack, 0, swordNum, -1);
			useSword = swordNum;
			for(int i = 0; i < swordNum; i++) {
				attack[i] = thrown[i] ? swordPoints[i] : throwPoints[i];
				if(attack[i] > attack[useSword]) useSword = i;
			}

			if(!thrown[useSword]) {
				hitPoint -= attack[useSword];
				thrown[useSword] = true;
				ans++;
			} else {
				ans += Math.ceil((double)hitPoint / attack[useSword]);
				break;
			}
		}

		System.out.println(ans);
	}
}