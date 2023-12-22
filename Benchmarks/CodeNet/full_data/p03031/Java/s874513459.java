import java.util.*;

class light{
	int[] switches;
	int p;
	
	public light(int[] switches){
		this.switches = switches;
		this.p = 0;
	}
	public void setp(int p){
		this.p = p;
	}
}

public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		light[] ls = new light[m];
		
		for(int i=0; i<m; i++){
			int k = sc.nextInt();
			int[] switches = new int[k];
			for(int j=0; j<k; j++){
				switches[j] = sc.nextInt();
			}
			ls[i] = new light(switches);
		}
		
		for(int i=0; i<m; i++){
			ls[i].setp(sc.nextInt());
		}
		
		int patterns = 1;
		for(int i=0; i<n; i++){
			patterns *= 2;
		}
		
		int[] on_off = new int[n];
		for(int i=0; i<patterns; i++){
			int p_copy = i;
			for(int j=0; j<n; j++){
				on_off[j] = p_copy % 2;
				p_copy = (p_copy - p_copy%2) / 2;
			}
			int all_ok = 1;
			pattern: for(int j=0; j<m; j++){
				light light = ls[j];
				int sum = 0;
				for(int k=0; k<light.switches.length; k++){
					sum += on_off[light.switches[k]-1];
				}
				if(sum % 2 != light.p){
					all_ok = 0;
					break pattern;
				}
			}
			if(all_ok == 1){
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
