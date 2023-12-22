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
			Attack att;
			if((att = atks.get((float)a/m))!=null) {
				if(att.m>m) {
					atks.put((float)a/m,new Attack(a,m));
				}
			}else {
				atks.put((float)a/m,new Attack(a,m));
			}
			
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
//		AttackNode minatkn = null;
		
		while(atkns.size()>0) {
			AttackNode atkn = atkns.remove(0);
			if(atkn.Hleft<=0) {
				if(atkn.M<minM) {
					//renew
					AttackNode atkp = atkn;
					while(atkp.parent!=null) {
						atkp = atkp.parent;
					}
//					minatkn = atkp;
					minM = atkn.M;
				}
			}else if(atkn.M>=minM) {
				//end
			}else {
				//generate
				atkn.generateChilds(atk);
				AttackNode[] atknt = atkn.child;
				for(int i=0;i<atknt.length;i++) {
					if(atknt[i]==null) {continue;}
					int Ht = atkn.Hleft - atknt[i].atk.a;
					int Mt = atkn.M + atknt[i].atk.m;
					if(Mt>=minM) {continue;}
					atknt[i].Hleft = Ht;
					atknt[i].M = Mt;
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
	AttackNode[] child;
	int Hleft;
	int M;
	
	public AttackNode(Attack atk){
		// TODO 自動生成されたコンストラクター・スタブ
		this.atk = atk;
		this.child = null;
	}
	public void generateChilds(Attack[] atks) {
		float c = (float)atk.a/atk.m;
		child = new AttackNode[atks.length];
		for(int i=0;i<atks.length;i++) {
			if(c*atks[i].m<atks[i].a) {continue;}
			child[i] = new AttackNode(atks[i]);
			child[i].parent = this;
		}
	}
	public String toString() {
		if(parent==null) {return atk.toString();}
		else {return parent.toString()+"->"+atk.toString();}
	}
}