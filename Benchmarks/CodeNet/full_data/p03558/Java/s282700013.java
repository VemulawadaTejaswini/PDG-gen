import java.util.*;
public class Main {
	public static void main(String[] args) {
		D();
	}
	
	public static void N() {
		double a = 0.1;
		double sum = 0;
		for(int i=0;i<100000;i++) {
			if(i%100==0) System.out.println(sum);
			sum += a;
		}
	}
	
	public static void A() {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		for(int i=0;i<3;i++) {
			if(s1.charAt(i)!=s2.charAt(2-i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	
	// 1から順に２乗を計算して、Nを超えるかどうか確認する。 O(root(N))
	//２分探索するなら、O(logN)
	// 二分探索で、Nの２乗を超えない最小の平方数を発見
	public static long binsearchN2(long left, long right, int N) {
		if(left >= right) return (long) Math.pow(right, 2);
		long mid = (left+right)/2;
		if(Math.pow(mid, 2) > N ) return binsearchN2(left, mid-1, N);
		else {
			//無限ループを防ぐ　再起する時は必ず、探索範囲が１以上小さくなる
			if(Math.pow(mid+1, 2) > N) return (long) Math.pow(mid, 2) ;
			else return binsearchN2(mid+1,right, N);
		}
	}
	
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(binsearchN2(0,N,N));
	}

	// Bを中心にして二分探索してAとCの数を掛け合わせる
	//　Aを中心とすると、O(N^2)
	
	// Bを超えない要素数を返す
	public static void C() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A=new double[N],  C = new double[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextDouble();
		}
		for(int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			C[i] = sc.nextDouble();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long sum = 0;
		for(int i=0;i<N;i++) {
			double b = B[i];
			sum += numlessB(A,b)*(long)numlargerB(C,b);
		}
		System.out.println(sum);
		
	}
	//Bよりも小さい要素の数　==Bは含まない Bを少しずらす
	public static int numlessB(double[] A, double B){
		int idx = Arrays.binarySearch(A, B-0.1);
		return -idx-1;
	}
	public static int numlargerB(double[] A, double B) {
		int idx = Arrays.binarySearch(A, B+0.1);
		return A.length-(-idx-1);
	}
	
	public static class Node{
		public Node() {
			
		}
		public int cost = -1;
		public boolean don = false; // コスト0の辺をキューに追加し終えたことを意味 
		public ArrayList<Node> root0 = new ArrayList<Node>();
		public ArrayList<Node> root1 = new ArrayList<Node>();
	}
	// 01BFSでコストを探索
	public static int calccost(Node root, Node goal) {
		LinkedList<Node> que = new LinkedList<Node>();
		root.cost = 0;
		que.add(root);
		while(!que.isEmpty()) {
			Node n = que.removeFirst();
				if(!n.don) {
					for(Node c : n.root0) {
						if(c==goal) return n.cost;
						else {
							if(c.cost<0) {
								c.cost = n.cost;
								//System.out.println(c.cost);
								que.addFirst(c);
							}
						}
					}
					n.don = true;
					que.addLast(n);
				}
				else {
					for(Node c : n.root1) {
						if(c==goal) return n.cost+1;
						else {
							if(c.cost<0) {
								c.cost = n.cost+1;
								que.addLast(c);
							}
						}
					}
				}
		}
		return -1;
	}

	public static void D() {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Node[] nodes = new Node[K];
		for(int i=0;i<K;i++) {
			nodes[i] = new Node();
		}
		for(int i=0;i<K-1;i++) {
			nodes[i].root1.add(nodes[i+1]);
			nodes[i].root0.add(nodes[(10*i)%K]);
		}
		nodes[K-1].root1.add(nodes[0]);
		nodes[K-1].root0.add(nodes[(10*(K-1))%K]);
		System.out.println(calccost(nodes[1],nodes[0])+1);
	}
}
