import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Parent[] P;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		P = new Parent[N];
		for(int i = 0;i < N;i++) {
			P[i] = new Parent();
		}
		for(int i = 0;i < N-1+M;i++) {
			int p = scn.nextInt()-1;
			int c = scn.nextInt()-1;
			P[c].add(p);
		}
		for(int i = 0;i < N;i++) {
			if(P[i].isOK()) {
				P[i].set();
			}else {
				ArrayList<Integer> parent = P[i].getParent();
				for(int p:parent) {
					boolean none = true;
					for(int pp:parent) {
						if(p == pp)continue;
						none &= !have(pp,p);
						if(!none)break;
					}
					if(none) {
						P[i].set(p);
						break;
					}
				}
			}
		}
		for(int i = 0;i < N;i++) {
			System.out.println(P[i].getRealP());
		}



	}


	public static boolean have(int parent, int element) {
		boolean ans = false;
		ArrayList<Integer> nowP = P[parent].getParent();
		for(int pp:nowP) {
			if(pp == element) {
				return true;
			}
		}
		for(int pp:nowP) {
				ans |= have(pp,element);
				if(ans)return true;
		}
		return ans;
	}

}

class Parent{
	ArrayList<Integer> parent;
	int realP;
	Parent(){
		parent = new ArrayList<Integer>();
	}

	void add(int p) {
		parent.add(p);
	}

	ArrayList<Integer> getParent(){
		return parent;
	}

	boolean isOK() {
		return parent.size() < 2;
	}

	void set(int i) {
		realP = i+1;
		}
	void set() {
		realP = parent.size()==0?0:parent.get(0)+1;
	}
	int getRealP() {
		return realP;
	}

}
