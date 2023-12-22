
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt()*2;
		String s = sc.next();
			
		
		char f[] = new char[n/2];
		char b[] = new char[n/2];
		
		for(int i = 0; i < n/2;i++){
			f[i] = s.charAt(i);
			b[i] = s.charAt(n-i-1);
		}
		
		Map<String,Integer> fmap = new HashMap<String,Integer>();
		Map<String,Integer> bmap = new HashMap<String,Integer>();
		
		for(int i = 0 ; i < (1 << (n/2)); i++){
			
			StringBuilder left = new StringBuilder();
			StringBuilder right = new StringBuilder();
			
			StringBuilder bleft = new StringBuilder();
			StringBuilder bright = new StringBuilder();
			
			
			for(int j = 0 ; j < n/2 ; j++){
				if( (i & (1<<j)) != 0 ){
					left.append(f[j]);
					bleft.append(b[j]);
				}else{
					right.append(f[j]);
					bright.append(b[j]);
				}
			}
			
			fmap.put(left+":"+right, fmap.getOrDefault(left+":"+right,0)+1);
			bmap.put(bleft+":"+bright, bmap.getOrDefault(bleft+":"+bright, 0)+1);
						
		}
		
		long ans =0 ;
		for(String key : fmap.keySet()){
			ans += (long)fmap.getOrDefault(key,0) * (long)bmap.getOrDefault(key, 0);
		}
		System.out.println(ans);
	}
	
	
	boolean eqlike(char[] r,char[] b){
		for(int i = 0; i < r.length;i++){
			if(r[i] ==0 || b[i]==0){
				continue;	
			}
			if(r[i] != b[i]){
				return true;
			}
		}
		return true;
	}
	
	
}
