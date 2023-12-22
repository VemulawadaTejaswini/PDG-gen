import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Map<Long,Integer>map=new TreeMap<>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++) map.put(sc.nextLong(), sc.nextInt());
		long money=0;
		for(long a:map.keySet()) {
			if(m<=map.get(a)) {
				money+=a*m;
				break;
			}else {
				m-=map.get(a);
				money+=a*map.get(a);
			}
		}
		System.out.println(money);
	}
}