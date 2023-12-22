import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Main {

	static BufferedReader reader;
	
	//static field here
	static Vertex[] vs;
	static long DIVISOR = 1000000007;
	static int N;
	static int K;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] NK = readLine();
		N = Integer.parseInt(NK[0]);
		K = Integer.parseInt(NK[1]);
		vs = new Vertex[N-1];
		for(int i=0;i<N-1;i++) {
			String[] t=readLine();
			vs[i]=new Vertex(Integer.parseInt(t[0])-1,Integer.parseInt(t[1])-1);
		}
		Arrays.sort(vs,new Comparator<Vertex>(){
			@Override
			public int compare(Vertex o1,Vertex o2){ // TODO 自動生成されたメソッド・スタブ
			return (o1.from==o2.from)?(o1.to-o2.to):(o1.from-o2.from); }
		});
		print(getTypes(0,0,-1)*K);
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC

	private static long getTypes(int node_id, int p_color, int pp_color) {
		for(int i=0;i<vs.length;i++) {
			if(vs[i].from==node_id) {
				long r = 1;
				int n = 0;
				for(int j=i;j<vs.length;j++) {
					if(vs[j].from!=node_id) {break;}
					r=(r*getTypes(vs[j].to,0,p_color))%DIVISOR;
					n++;
				}
				r=(r*P((pp_color==-1)?(K-1):(K-2),n))%DIVISOR;
				return r;
			}
		}
		return 1;
	}
	private static long P(int n, int r) {
		long res = 1;
		for(int i=0;i<r;i++) {
			res=(res*(n-i))%DIVISOR;
		}
		return res;
	}
	
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}

class Vertex{
	public int from,to;
	
	public Vertex(int from, int to){
		// TODO 自動生成されたコンストラクター・スタブ
		if(from<to) {
			this.from = from;
			this.to = to;
		}else {
			this.from = to;
			this.to=from;
		}
	}
	@Override
	public String toString() {
		return this.from+","+this.to;
	}
}