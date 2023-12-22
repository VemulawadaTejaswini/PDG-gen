import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;

	static int MAX = 10000000;
	static	ArrayList<TreeNode> tree;
	static HashSet<Integer> set;
	static long ans;

	static HashSet<Integer> memo;
	static HashMap<Integer, TreeNode> map;

	static ArrayList<ArrayList<Integer>> xdata;
	static ArrayList<ArrayList<Integer>> ydata; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		xdata = new ArrayList<ArrayList<Integer>>();
		ydata = new ArrayList<ArrayList<Integer>>();

		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
			ArrayList<Integer> xlist = new ArrayList<Integer>();
			ArrayList<Integer> ylist = new ArrayList<Integer>();

			for(int j = 0;j < a[i];j++){
				int x = sc.nextInt()-1;
				int y = sc.nextInt();
				xlist.add(x);
				ylist.add(y);
				
			}
			xdata.add(xlist);
			ydata.add(ylist);
		}
		
		int bit = 0;
		int ans = 0;
		for(;bit < (1<<n);bit++){
			if(isOk(bit,n)){
				
				int num = countbit(bit,n);		//立っているbitの本数を数える
				ans = Math.max(ans, num);
			}
//			System.out.println();

		}
		System.out.println(ans);
		

	}
	
	static boolean isOk(int bit,int n){
//		System.out.println("isOk");

//		System.out.println(bit);
		for(int i = 0;i < n;i++){
			ArrayList<Integer> xlist = xdata.get(i);
			ArrayList<Integer> ylist = ydata.get(i);
			if(((1 << i) & bit) == 0){
				continue;
			}
			for(int j = 0;j < xlist.size();j++){
				int x = xlist.get(j);
				int y = ylist.get(j);
				
				if(y == 1 && (((1 << x) & bit) == 0)){
//					System.out.println("false");

					return false;
				}else if(y == 0 && (((1 << x) & bit) != 0)){
//					System.out.println("false");

					return false;
				}
			}
			
	
		}
		return true;
	}
	
	static int countbit(int bit,int n){
		int count = 0;
		int x = 1;
		for(int i = 0;i < n;i++){
			if((x & bit) != 0){
				count++;
			}
			x <<= 1;
		}
		
		return count;
		
	}
















static long fac[] = new long[MAX];
static long finv[] = new long[MAX];
static long inv[] = new long[MAX];



//テーブルの作成
static void COMinit() {
	fac[0] = fac[1] = 1;
	finv[0] = finv[1] = 1;
	inv[1] = 1;
	for (int i = 2; i < MAX; i++){
		fac[i] = fac[i - 1] * i % MOD;
		inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
		finv[i] = finv[i - 1] * inv[i] % MOD;
	}
}

// 二項係数計算
static	long COM(int n, int k){
	if (n < k) return 0;
	if (n < 0 || k < 0) return 0;
	return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
}








static int upperbond(int k,ArrayList<Integer> data){		//k以下で最大の値をdataの中から探し、返す二分探索
	if(data == null){
		return -1;
	}
	int max = data.size();
	int min = -1;
	while(max-min > 1){
		int mid = (max+min)/2;
		if(data.get(mid) <= k){
			min = mid;
		}else{
			max = mid;
		}
	}


	//		if(min != -1){
	//			min = data.get(min);
	//		}

	//		System.out.println(max);
	return min;					//indexを返している
}

static int lowerbond(int k,ArrayList<Integer> data){		//k以上で最小の値をdataの中から探し、返す二分探索
	if(data == null){
		return -1;
	}
	//		System.out.println("lo");
	//		System.out.println("lo");
	int max = data.size();
	int min = -1;

	while(max-min > 1){
		int mid = (max+min)/2;
		if(data.get(mid) >= k){
			max = mid;
		}else{
			min = mid;
		}
	}

	return max;			//indexを返している
}



static int gcd(int a,int b){				//最大公約数を返す
	if(b == 0){
		return a;
	}else{
		return gcd(b, a%b);
	}
}
static long gcd(long a,long b){
	if(b == 0){
		return a;
	}else{
		return gcd(b, a%b);
	}
}



static long lcm (long a, long b) {
	long g = gcd(a,b);
	return a/g*b;
}
}



class TreeNode{
	int value;
	ArrayList<TreeNode> children;
	boolean root;
	boolean fchild;

	public TreeNode(int value,ArrayList<TreeNode> children,boolean root) {
		this.value = value;
		this.children = children;
		this.root = root;
	}


}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int from,int end) {
		this.from = from;
		this.end = end;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  from - otherpair.from;
	}








}




