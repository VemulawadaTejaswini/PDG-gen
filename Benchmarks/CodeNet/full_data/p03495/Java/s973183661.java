import java.util.HashMap;
import java.util.Scanner;
 
class Main {
	int n;
	int k;
	HashMap<Integer,Integer> a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		k = sc.nextInt();
		a = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			if(a.containsKey(num)) {
				a.replace(num, a.get(num)+1);
			} else {
				a.put(num, 1);
			}
		}
	}
	void solve(){
		/*int ans = 0;
		if(a.size()>k){
			int min;
			while(a.size()>k){
				min = -1;
				for(int i:a.keySet()){
					if(min==-1){
						min = i;
					} else {
						if(a.get(min)>a.get(i)){
							min = i;
						}
					}
				}
				ans += a.get(min);
				a.remove(min);
			}
		}
		System.out.println(ans);*/
	}
}