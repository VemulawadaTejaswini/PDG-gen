import java.util.Scanner;

/**
 * https://abc074.contest.atcoder.jp/tasks/arc083_a
 */
public class Main {

	static int A,B,C,D,E,F;
	static boolean[] wdp = new boolean[3001];
	static boolean[] sdp = new boolean[3001];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();
		sc.close();
		
		setWDP(0);
		setSDP(0);
		
		double max = 0;
		int ansW = 0;
		int ansS = 0;
		for(int i=0; i<=F/100; i++){
			int w = i*100;
			if(!wdp[w]) continue;
			int maxSugar = Math.min(F-w, i*E);
			for(int s=maxSugar; s>=0; s--){
				if(!sdp[s]) continue;
				double p = (double)(s)/(double)(w+s);
				if(max<p){
					max = p;
					ansW = w;
					ansS = s;
				}
				break;
			}
		}		
		System.out.println(String.format("%d %d", ansW+ansS, ansS));
	}
	
	static void setWDP(int current){
		if(current>F || wdp[current]) return;
		wdp[current] = true;
		setWDP(current+A*100);
		setWDP(current+B*100);
	}
	
	static void setSDP(int current){
		if(current>F || sdp[current]) return;
		sdp[current] = true;
		setSDP(current+C);
		setSDP(current+D);
	}

}
