
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		HashSet<Integer> list = new HashSet<>();
		for(int i=0;i<N;i++){
			int ins = Integer.parseInt(sc.next());
			if(list.contains(ins)){
				list.remove(ins);
			}
			else{
				list.add(ins);
			}
		}


		out.println(list.size());
		
		sc.close();
		out.flush();
	}

	public static long gcd(long a, long b){
		long r = a % b;
		if(r==0){
			return b;
		}
		else{
			return gcd(b,r);
		}
	}
}