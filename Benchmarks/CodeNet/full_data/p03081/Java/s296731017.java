import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String[] t = new String[q];
		String[] d = new String[q];
		for(int i = 0; i < q; i++){
			t[i] = sc.next();
			d[i] = sc.next();
		}
		int[][] iti = new int[n][26];
		int[] iticou = new int[26];
		for(int i = 0; i < n; i++){
			int tmp = s.charAt(i) -65;
			iti[iticou[tmp]][tmp] = i+1;
			iticou[tmp]++;
		}
		int[] go = new int[n+2];
		Arrays.fill(go,1);
		go[0] = 0;
		go[n+1] = 0;
		for(int i = 0; i < q; i++){
			int tmp = t[i].charAt(0)-65;
			if(d[i].equals("L")){
				for(int j = 0; j < iticou[tmp]; j++){
					go[iti[j][tmp]-1]+=go[iti[j][tmp]];
					go[iti[j][tmp]] = 0;
				}
			}else{
				for(int j = 0; j < iticou[tmp]; j++){
					go[iti[j][tmp]+1]+=go[iti[j][tmp]];
					go[iti[j][tmp]] = 0;
				}
			}
			/*Arrays.stream(go).forEach(System.out::print);
			System.out.println();*/
		}
		System.out.print(n-go[0]-go[n+1]);
	}
}
