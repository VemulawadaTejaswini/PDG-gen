import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Main {
	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		boolean neg=false;
		if((Math.min(x1, x2)==x1) !=(Math.min(y1, y2)==y1))
			neg=true;
		if(neg){
			x1*=(-1);
			x2*=(-1);
		}
		
		int minX=Math.min(x1, x2);
		int maxX=Math.max(x1, x2);
		int minY=Math.min(y1, y2);
		int maxY=Math.max(y1, y2);
		
		
		
		int n=sc.nextInt();
		int [] x=new int [n];
		int [] y=new int [n];
		TreeMap<Integer, Integer> mapX=new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> mapY=new TreeMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			if(neg)
				x[i]*=(-1);
			y[i]=sc.nextInt();
			mapX.put(x[i], y[i]);
			mapY.put(y[i], x[i]);
		}
		double circ=Math.PI*20;
		double init=100.0*(maxX-minX+maxY-minY);
		double op1=init,op2=init;
		if(mapX.containsKey(minX)){
			int tmp=mapX.get(minX);
			if(tmp>minY && tmp<maxY)
				op1+=(circ/2-20);
			if(tmp==maxY)
				op1+=(circ/4-20);
		}
		if(mapY.containsKey(maxY)){
			int tmp=mapY.get(maxY);
			if(tmp>minX && tmp<maxX)
				op1+=(circ/2-20);
		}
		if(mapX.containsKey(maxX)){
			int tmp=mapX.get(maxX);
			if(tmp>minY && tmp<maxY)
				op2+=(circ/2-20);
			if(tmp==minY)
				op2+=(circ/4-20);
		}
		if(mapY.containsKey(minY)){
			int tmp=mapY.get(minY);
			if(tmp>minX && tmp<maxX)
				op2+=(circ/2-20);
		}
		double dis=Math.min(op1, op2);
		ArrayList<pair> arr=new ArrayList<pair>();
		for(int i=0;i<n;i++)
			if(x[i]>=minX && x[i]<=maxX && y[i]>=minY && y[i]<=maxY){
				arr.add(new pair(x[i], y[i]));
			}
		Collections.sort(arr);
		int [] a=new int [arr.size()];
		for(int i=0;i<a.length;i++)
			a[i]=arr.get(i).y;
		int l=lis(a, a.length);
		if(minX!=maxX && minY!=maxY)
			if(maxX-minX>1 && maxY-minY>1)
				dis=Math.min(dis, init-l*(20-circ/4));
			else{
				if(l>1)
					l--;
				dis=Math.min(dis, init-l*(20-circ/4));
			}
		pw.println(dis);
		pw.flush();
		pw.close();
	}
	
	static class pair implements Comparable<pair>{
		int x,y;
		pair(int a,int b){
			x=a;
			y=b;
		}
		public int compareTo(pair o) {
			return x-o.x;
		}
	}
	
	public static int lis(int [] a,int n){
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int pos=Collections.binarySearch(l, a[i]);
			if(pos<0)
				pos=-(pos+1);
			if(pos>=l.size())
				l.add(a[i]);
			else
				l.set(pos, a[i]);
		}
		return l.size();
	}
	
	static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {while (st == null || !st.hasMoreElements()) {
			try {st = new StringTokenizer(br.readLine());}
			catch (IOException e) {e.printStackTrace();}}
		return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		String nextLine(){String str = "";
		try {str = br.readLine();}
		catch (IOException e) {e.printStackTrace();}
		return str;}
	}
}