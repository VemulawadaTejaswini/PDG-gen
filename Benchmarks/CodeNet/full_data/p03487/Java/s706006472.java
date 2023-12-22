import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashMap<Long, Long> a = new HashMap<>();
		long aa=0;
		for(i=0;i<n;i++) {
			aa = parseLong(sc.next());
			if(a.get(aa) == null) {
				a.put(aa, 1L);
			} else {
				a.put(aa, a.get(aa)+1);
			}
		}
		sc.close();
		long ans=0;
		for(Long ll:a.keySet()) {
			if(a.get(ll)>ll) {
				ans+=a.get(ll)-ll;
			} else if(a.get(ll)<ll) {
				ans+=a.get(ll);
			}
		}
		out.println(ans);
	}
}