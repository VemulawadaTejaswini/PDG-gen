import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] HN = readLine();
		int H = Integer.parseInt(HN[0]);
		int N = Integer.parseInt(HN[1]);
		Map<Float,Attack> atks = new TreeMap<>();
		for(int i=0;i<N;i++) {
			String[] t = readLine();
			int a = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			atks.put((float)a/m,new Attack(a,m));
		}
		int Nn = atks.size();
		Attack[] atk = new Attack[Nn];
		Set<Float> ks = atks.keySet();
		Iterator<Float> ki = ks.iterator();
		for(int i=0;i<Nn;i++) {
			atk[Nn-i-1] = atks.get(ki.next());
		}
		
		ArrayList<AttackNode> atkns = new ArrayList<>();
		for(int i=0;i<Nn;i++) {
			AttackNode atknt = new AttackNode(atk[i]);
			atknt.Hleft = H - atknt.atk.a;
			atknt.M = atknt.atk.m;
			atknt.parent = null;
			atkns.add(atknt);
		}
		int minM = atk[0].m*((H+atk[0].a-1)/atk[0].a);
		AttackNode minatkn = new AttackNode(atk[0]);
		AttackNode atkntt = minatkn;
		for(int i=((atk[0].a+atk[0].m-1)/atk[0].m);i>=0;i--) {
			atkntt.child = new AttackNode(atk[0]);
			atkntt.child.parent = atkntt;
			atkntt = atkntt.child;
		}
		
		while(atkns.size()>0) {
			AttackNode atkn = atkns.remove(0);
			while(atkn.child!=null) {atkn = atkn.child;}
			if(atkn.Hleft<=0) {
				if(atkn.M<minM) {
					//renew
					AttackNode atkp = atkn;
					while(atkp.parent!=null) {
						atkp = atkp.parent;
					}
					minatkn = atkp;
					minM = atkn.M;
				}
			}else if(atkn.M>=minM) {
				//end
			}else {
				//generate
				AttackNode[] atknt = atkn.generateChilds(atk);
				for(int i=0;i<atknt.length;i++) {
					int Ht = atkn.Hleft - atknt[i].child.atk.a;
					int Mt = atkn.M + atknt[i].child.atk.m;
					atknt[i].child.Hleft = Ht;
					atknt[i].child.M = Mt;
					while(atknt[i].parent!=null) {atknt[i] = atknt[i].parent;}
					atkns.add(0,atknt[i]);
				}
			}
		}
		print(minM);
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
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

class Attack{
	int a;
	int m;
	
	public Attack(int a, int m){
		// TODO 自動生成されたコンストラクター・スタブ
		this.a = a;
		this.m = m;
	}
	public String toString() {
		return a+"-"+m;
	}
}

class AttackNode{
	Attack atk;
	AttackNode parent;
	AttackNode child;
	int Hleft;
	int M;
	
	public AttackNode(Attack atk){
		// TODO 自動生成されたコンストラクター・スタブ
		this.atk = atk;
		this.child = null;
	}
	public AttackNode[] generateChilds(Attack[] atks) {
		ArrayList<AttackNode> ret = new ArrayList<>();
		float c = (float)atk.a/atk.m;
		for(int i=0;i<atks.length;i++) {
			if(c*atks[i].m<atks[i].a) {continue;}
			AttackNode node = new AttackNode(atk);
			node.child = new AttackNode(atks[i]);
			node.child.parent = node;
			ret.add(node);
		}
		return ret.toArray(new AttackNode[ret.size()]);
	}
	public String toString() {
		if(parent==null) {return atk.toString();}
		else {return parent.toString()+"->"+atk.toString();}
	}
}