import java.util.*;
import java.util.regex.*;
public class Main {
	public static void main(String[] args) {
		D(2);
	}
	
	// R+X = 2G
	public static void A() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		System.out.println(2*g-r);
	}
	
	//シミュレート
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ret = 1;
		for(int i=0;i<N;i++) {
			if(ret<K) ret += ret;
			else ret += K;
		}
		System.out.println(ret);
	}
	
	//Tをもっとも後ろに当てはめる
	//残りの?をaで埋める
	
	//Tがマッチするかどうか　マッチするならもっとも後ろの位置を返す else -1
	public static int match(String S, String T) {
		for(int i=S.length()-1;i>=T.length()-1;i--) {
			if((S.charAt(i)==T.charAt(T.length()-1) || S.charAt(i)=='?')  && checksame(S,T,i)) return i-T.length()+1;
		}
		return -1;
	}
	// i-T.length()+1 ~ iが一致するか調べる　？はワイルドカード
	public static boolean checksame(String S, String T, int i) {
		for(int j = 0;j<T.length();j++) {
			if(S.charAt(i-T.length()+1+j)!=T.charAt(j) && S.charAt(i-T.length()+1+j)!='?') return false;
		}
		return true;
	}
	
	public static void C() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int matchidx = match(S,T);
		if(matchidx == -1) {
			System.out.println("UNRESTORABLE");
			return;
		}
		StringBuilder ns = new StringBuilder();
		int i=0;
		for(;i<matchidx;i++) {
			if(S.charAt(i)=='?') ns.append('a');
			else ns.append(S.charAt(i));
		}
		ns.append(T.toCharArray());
		i += T.length();
		for(;i<S.length();i++) {
			if(S.charAt(i)=='?') ns.append('a');
			else ns.append(S.charAt(i));
		}
		ns.toString();
		System.out.println(ns);
	}

	public static void GC() {
        java.util.Scanner c=new java.util.Scanner(System.in);
        String s=c.next(),t=c.next();
        System.out.println("(.*)"+t.replaceAll(".","[$0?]")+"(.*?)"); //各文字 c-> [c?] c or ?
        // *は最長一致0以上 *?は最短一致 なので、下のマッチは一番後ろのやつただ一つでマッチする
        Pattern p = Pattern.compile("(.*)"+t.replaceAll(".","[$0?]")+"(.*?)"); //.*は任意の文字０個以上、つまり、c or ? ... r or ? を部分文字列として持つ
        Matcher matcher = p.matcher(s);
        System.out.println(matcher);
        // マッチしたのは文全体　任意最長＋t.rep+任意最短 なので、全てを置き換えている
        // $1は任意で一致した部分を意味する
        System.out.println(matcher.matches()?matcher.replaceFirst("$1"+t+"$2").replace('?','a'):"UNRESTORABLE");
    }

	//区間ごとに区切って近似する。 １秒をestim個のセクションに分割し計算する。
	public static double calctrape(double l, double r, double space) {
		return ((l+r)*space)/2.0;
	}
	
	public static void D(int estim) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] time = new int[N];
		int sumtime = 0;
		for(int i=0;i<N;i++) {
			time[i] = sc.nextInt();
			sumtime += time[i];
		}
		double[] min = new double[sumtime*estim+1];
		int counter = 0; //最初は0
		for(int i=0;i<N;i++) {
			int upbound = sc.nextInt();
			for(int j=0;j<time[i]*estim;j++) {
				min[counter] = upbound;
				counter++;
			}
		}
		//System.out.println(min[12]);
		min[0] = 0;
		min[min.length-1] = 0;
		for(int i=1;i<sumtime*estim+1;i++) {
			min[i] = Math.min(min[i], min[i-1]+1.0/estim);
		}
		for(int i=sumtime*estim-1;i>=0;i--) {
			min[i] = Math.min(min[i], min[i+1]+1.0/estim);
		}
		double sum = 0;
		for(int i=0;i<sumtime*estim;i++) {
			//System.out.println(min[i] + " " + calctrape(min[i],min[i+1],1.0/estim));
			sum += calctrape(min[i],min[i+1],1.0/estim);
			//if(i==30*2+1) System.out.println(min[i]);
			//if(i==70*2+2) System.out.println(min[i]);
			//if(i==100*2) System.out.println(min[i]);
		}
		System.out.println(sum);
	}
}
