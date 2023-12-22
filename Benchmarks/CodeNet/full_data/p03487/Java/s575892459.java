import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		ArrayList<Integer> a = new ArrayList<Integer>(N);
		int ans = 0;
		for(int i = 0; i < N; i++){
			a.add(Integer.parseInt(in.next()));
		}
		TreeSet<Integer> b=new TreeSet<>(a);
		for(int s:b){
			int coun=0;
			for(int c:a){
				if(s ==c)coun++;
				if(c>s)break;
			}
			if(s < coun)ans += coun - s;
			else if(s > coun) ans += coun;
		}
		System.out.println(ans);
	}
}