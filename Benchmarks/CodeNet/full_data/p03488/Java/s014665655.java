import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
		sc.close();
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a+b+1)/2);
	}
	
	public static void B(Scanner sc) {
		//一方の文字を辞書順にソート　他方を逆辞書順にソート
		String s = sc.next();
		String t = sc.next();
		Character[] sch = new Character[s.length()];
		Character[] tch = new Character[t.length()];
		for(int i=0;i<s.length();i++) {
			sch[i] = s.charAt(i);
		}
		for(int i=0;i<t.length();i++) {
			tch[i] = t.charAt(i);
		}
		Arrays.sort(sch);
		Arrays.sort(tch,Collections.reverseOrder());
		s = makeString(sch);
		t = makeString(tch);
		if(s.compareTo(t)<0) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static String makeString(Character[] c) {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<c.length;i++) {
			s.append(c[i]);
		}
		return new String(s);
	}
	// 数字->頻度のmap 数字>頻度　→　-頻度　　数字＜頻度　→　ー（頻度ー数字）
	public static void C(Scanner sc) {
		int N = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sum = 0;
		for(int i=0;i<N;i++) {
			int in = sc.nextInt();
			if(map.containsKey(in)) map.put(in,map.get(in)+1);
			else map.put(in,1);
		}
		for(int i : map.keySet()) {
			if(i>map.get(i)) sum += map.get(i);
			if(i<map.get(i)) sum += map.get(i)-i;
		}
		System.out.println(sum);
	}
	
	
	public static void D(Scanner sc) {
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int firstx = 0;
		int i=0;
		for(;i<s.length();i++) {
			if(s.charAt(i) == 'T') {
				firstx = i;
				break;
			}
		}
		x -= firstx;
		ArrayList<Integer> xs = new ArrayList<Integer>();
		ArrayList<Integer> ys = new ArrayList<Integer>();
		boolean isy = true;
		int countF = 0;
		for(i++;i<s.length();i++) {
			if(s.charAt(i)=='T') {
				if(isy) ys.add(countF);
				else xs.add(countF);
				countF = 0;
				isy = !isy;
			}
			else countF++;
		}
		if(countF>0) {// 最後がTで終わらない場合
			if(isy) ys.add(countF);
			else xs.add(countF);
		}
		Integer[] sx = xs.toArray(new Integer[xs.size()]);
		Integer[] sy = ys.toArray(new Integer[ys.size()]);
		//printar(sx);
		//printar(sy);
		if(calcps(sx,x) && calcps(sy,y)) System.out.println("Yes");
		else System.out.println("No");
	}
	
	// 数字の配列を受け取る それらの数字を足し引きしてxを作れるかどうか
	//aは全て正であると仮定
	public static boolean calcps(Integer[] a, int target) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		if(sum == target) return true;
		else if(sum < target || (sum-target)%2!=0) return false;
		else {//マイナスにすべき値の和は (target-sum)/2
			//System.out.println("たrげt" + (target-sum)/2);
			return canmake(a, (sum-target)/2);
		}
	}
	// aの要素のうち、いくつかを足し合わせてtargetを作ることができるか？ aは同じ値も可能
	// n = target とすると、 O(n^2)
	//targetが負の場合もある 本問題では、targetは常に正
	public static boolean canmake(Integer[] a, int target) {
		if(target<0) {
			Integer[] nega = new Integer[a.length];
			for(int i=0;i<a.length;i++) {
				nega[i] = -a[i];
			}
			return canmake(nega,-target);
		}
		boolean[] make = new boolean[target+1]; //aの値を足し合わせて、作れるかどうか
		for(int x : a) {
			if(x<make.length && x>=0) make[x] = true;
			for(int i=0;i<make.length;i++) {
				if(make[i] && i+x<make.length && i+x>=0) make[i+x]=true;
			}
		}
		return make[target];
	}
	//配列の各要素に対し、
	public static void printar(Integer[] a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
