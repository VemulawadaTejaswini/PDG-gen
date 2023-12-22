import java.util.Map;
import java.util.TreeMap;

public class Main {
	private static Map<String,Boolean> map =new TreeMap<String,Boolean>();

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n=s.nextInt();
		long a[]=new long[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextLong();
		}
		System.out.println(calc(a)?"Yes":"No");

	}
	public static boolean calc(long a[]) {
		boolean used[]=new boolean[a.length];
		used[0]=true;
		for(int i=1;i<a.length;i++) {
			used[i]=true;
			for(int j=i+1;j<a.length;j++) {
				used[j]=true;
				boolean res = calc(a,used,a.length-3,a[0],i,j);
				if(res) {
					return true;
				}
				used[j]=false;
			}
			used[i]=false;
		}
		return false;

	}
	public static boolean calc(long a[],boolean used[],int remUsed,long prevVal,int nowInd,int nextInd) {
		if(remUsed==0) {
			return a[nowInd] == (prevVal ^ a[nextInd]);
		}
		if(a[nowInd] != (prevVal ^ a[nextInd])) {
			return false;
		}
		String key = publishKey(used,remUsed,prevVal,nowInd,nextInd);
		Boolean res = map.get(key);
		if(res != null) {
			return res;
		}
		for(int i=1;i<a.length;i++) {
			if(!used[i]) {
				used[i]=true;
				res = calc(a,used,remUsed-1,a[nowInd],nextInd,i);
				used[i]=false;
				if(res) {
					return res;
				}
			}
		}
		map.put(key,false);
		return res;
	}

	public static String publishKey(boolean used[],int remUsed,long prevVal,int nowInd,int nextInd) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<used.length;i++) {
				sb.append((used[i])?'1':'0');
		}
		sb.append(' ').append(remUsed).append(' ');
		sb.append(' ').append(prevVal).append(' ');
		sb.append(' ').append(nowInd).append(' ');
		sb.append(' ').append(nextInd).append(' ');
		return sb.toString();
	}
}
