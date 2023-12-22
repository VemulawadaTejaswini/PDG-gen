import java.util.*;

class Main{
	static int[] v;
	static int answer = 0;
	static int n;
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		v = new int[n];
		for(int i = 0; i < n; i++){
			v[i] = sc.nextInt();
			if(!numlist.contains(v[i])){
				numlist.add(v[i]);
			}
		}
		if(numlist.size() != 1){
			Main abc = new Main();
			abc.calc(0);
			System.out.print(answer);
		}else{
			System.out.print(n/2);
		}
	}
		
	void calc(int c){
		if(c < n-2){
			if(v[c] != v[c+2]){
				answer++;
			}else{
				calc(c+2);
			}
			calc(c+1);
		}
	}
}
