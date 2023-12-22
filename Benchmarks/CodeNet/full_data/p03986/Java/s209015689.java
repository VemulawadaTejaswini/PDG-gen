import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer>map=new TreeMap();
		String s=sc.next();
		int T=0;int S=0;int cut=0;
		for(int i=s.length();i>	0;i--) {
			if(s.substring(i-1, i).equals("T")) {
				T++;
				int oldcut=cut;
				cut+=Math.min(S, T)*2;
				S=0;
				if(cut!=oldcut)T=1;
			}else {
				if(T>0)S++;
			}
		}
		if(S>=T) {
			cut+=S*2;
		}
		System.out.println(s.length()-cut);
		}
	}
