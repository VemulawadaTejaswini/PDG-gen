/*
 * Remember a 6.72 student can know more than a 10.0 student.
 * Grades don't determine intelligence, they test obedience. 
 * I Never Give Up.
 * I will become Candidate Master today.
 * I will defeat Saurabh Anand.
 * Skills are Cheap,Passion is Priceless.
 */
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

import static java.lang.System.out;
import static java.util.Arrays.*;
import static java.lang.Math.*;
 
public class Main{
	private static Reader in=new Reader();
	private static StringBuilder ans=new StringBuilder();
	private static long MOD=(long)1e9+7;
	private static final int N=(int) (1e6+7); // 1e5+7
    private static ArrayList<Integer> v[]=new ArrayList[N];
	private static boolean mark[]=new boolean[N];
//    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private static long powmod(long x,long n){
		if(n==0||x==0)
			return 1;
		else if(n%2==0)
			return(powmod((x*x)%MOD,n/2));
		else
			return (x*(powmod((x*x)%MOD,(n-1)/2)))%MOD;
	}
	private static void shuffle(long[] arr){
		for(int i=arr.length-1;i>=2;i--){
			int x=new Random().nextInt(i-1);
			long temp=arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
		}
	}
	private static void shuffle(int[] arr){
		for(int i=arr.length-1;i>=2;i--){
			int x=new Random().nextInt(i-1);
			int temp=arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
		}
	}
    private static long gcd(long a, long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
//    private static boolean check(int x,int y){
//        if((x>=0&&x<n)&&(y>=0&&y<m)&&mat[x][y]!='X'&&!visited[x][y])return true;
//        return false;
//    }
    public static int mod(int n,int c){
    	if(n<0)return n%c+c;
    	return n%c;
    }
//    public static boolean setCheck(long num,int pos){
//    	int c=1;
//    	int len=0;
//    	while(c<=num){
//    		if(len==pos&&(num&c)>=1){
//    			return true;
//    		}
//    		len++;
//    		c<<=1;
//    	}
//    	return false;
//    }
//    public static void setBit(int bit[],long num){
//    	long c;
//    	for(int j=0;j<64;j++){
//    		c=1L<<j;
//			if((num&c)>=1){
//				bit[j]++;
//			}
//		}
//    }
    static void swap(int a[],int index1,int index2){
		int temp=a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
	}
    static void reverse(int a[],int start,int end){  //Start should be equal to k+1 but end should be less than end
		int temp;
		int temp_a[]=new int[end-start];
		for(int i=0;i<temp_a.length;i++)
			temp_a[i]=a[start++];
		for(int i=0;i<temp_a.length;i++){
			a[--end]=temp_a[i];
		}
	}
    static int next_permutation(int ar[]){
		int k=0,l=0;
		int index=0;
		while(index<ar.length-1){
			if(ar[index]<ar[index+1])k=index;
			index++;
		}
		int value=ar[k];
		for(int i=k+1;i<ar.length;i++){
			if(value<ar[i])l=i;
		}
		swap(ar,k,l);
		if(k!=l){
			reverse(ar,k+1,ar.length);
			return 1;
		}
		else return 0;
	}	
	public static void main(String[] args) throws IOException{
		int n=in.nextInt();
		int m=in.nextInt();
		int x,y;
		for(int i=0;i<n;i++)
			v[i]=new ArrayList();
		for(int i=0;i<m;i++){
			x=in.nextInt()-1;
			y=in.nextInt()-1;
			v[x].add(y);
			v[y].add(x);
		}
		int pem[]=new int[n];
		for(int i=0;i<n;i++)
			pem[i]=i;
		boolean flag;
		int cnt=0;
		do{
			flag=true;
			if(pem[0]!=0)continue;
			for(int i=0;i+1<n;i++){
				if(!v[pem[i]].contains(pem[i+1])){flag=false;break;}
			}
			if(flag)cnt++;
		}while(next_permutation(pem)!=0);
		pn(cnt);
	}
	static class Pair<T> implements Comparable<Pair>{
		int l;
		int r;
		Pair(){
			l=0;
			r=0;
		}
		Pair(int k,int v){
			l=k;
			r=v;
		}
		@Override
		public int compareTo(Pair o){
			if(l!=o.l)return (int)(l-o.l);
			return (int)(r-o.r);
		}
		// Fenwick tree question comparator
//        @Override
//        public int compareTo(Pair o) {
//            if(o.r!=r)return (int) (r-o.r);
//            else return (int)(l-o.l);
//        }
	}
	//Reader Class
	static class Reader{
		BufferedReader br;
		StringTokenizer st;
		public Reader(){br=new BufferedReader(new InputStreamReader(System.in));}
		String next(){
			while(st==null||!st.hasMoreElements()){
				try{st=new StringTokenizer(br.readLine());
				}catch(IOException e){e.printStackTrace();}
			}
			return st.nextToken();
		}
		int nextInt(){return Integer.parseInt(next());}
		long nextLong(){return Long.parseLong(next());}
		double nextDouble(){return Double.parseDouble(next());}
		String nextLine(){
			String str="";
			try{
				str=br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
	//Printer Methods
	static void pn(Object o){out.print(o);}
	static void pln(Object o){out.println(o);}
	static void pln(){out.println();}
	static void pf(String format,Object o){out.printf(format,o);}
	//Appenders
	static void app(Object o){ans.append(o);}
}