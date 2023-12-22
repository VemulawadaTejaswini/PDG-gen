import static java.lang.System.*;
import java.util.*;

public class Main {
	public static int getMSB(int n) {
		n = (n & 0xffff0000) > 0 ? n & 0xffff0000 : n;
		n = (n & 0xff00ff00) > 0 ? n & 0xff00ff00 : n;
		n = (n & 0xf0f0f0f0) > 0 ? n & 0xf0f0f0f0 : n;
		n = (n & 0xcccccccc) > 0 ? n & 0xcccccccc : n;
		n = (n & 0xaaaaaaaa) > 0 ? n & 0xaaaaaaaa : n;
		
		return n;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
		int[] num = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
			
			if(!map.containsKey(num[i])) map.put(num[i], 0);
			map.put(num[i], map.get(num[i])+1);
		}
		Arrays.sort(num);
		
		int ans = 0;
		for(int i = n-1; i>=0; i--) {
			map.put(num[i], map.get(num[i]) - 1);
			
			int target = (getMSB(num[i]) << 1) - num[i];
			if(map.containsKey(target) && map.get(target) > 0) {
				map.put(target, map.get(target) - 1);
				ans++;
			}
		}
		
        out.println(ans);
    }
}