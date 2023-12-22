import java.util.Scanner;

/**
 * http://code-festival-2017-quala.contest.atcoder.jp/tasks/code_festival_2017_quala_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		int[] alp = new int[26];
		for(int i=0; i<H; i++){
			for(char c: sc.next().toCharArray())
				alp[c-'a']++;
		}
		sc.close();
		
		int d = 0;
		int o = 0;
		for(int a:alp){
			if(a%4==1){
				o++;
			}else if(a%4==2){
				d++;
			}else if(a%4==3){
				d++;
				o++;
			}
		}
		
		boolean ans = false;
		if(W%2==0 && H%2==0){
			ans = d==0 && o==0;
		}else if(W%2==0){
			ans = d<=W/2 && o==0;
		}else if(H%2==0){
			ans = d<=H/2 && o==0;
		}else{
			ans = o<=1 && d<=(H-1)/2+(W-1)/2;
		}
		
		System.out.println(ans ? "Yes" : "No");

	}

}
