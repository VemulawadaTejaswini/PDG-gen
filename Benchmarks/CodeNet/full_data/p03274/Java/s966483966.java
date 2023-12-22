import java.util.Scanner;

public class Main{
	static int N;
	static int M;
	static byte [] V1;
	static byte [] V2;
	static int k1;
	static int k2;
	static String string="";
	static int tag=0;
	static byte x;
	static byte y;
	
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		byte [] inputA = new byte [N+1];
		byte [] inputB = new byte [N+1];
		k1=0;
		k2=0;
		inputB[k2++]=0;
		for(int i=0;i<N;i++) {
			byte t = sc.nextByte();
			if(t<=0) {
				inputA[k1++]=t;
			}else{
				inputB[k2++]=t;
			}
		}
		inputA[k1++]=0;
		sc.close();
		V1=new byte [k1-1];
		V2=new byte [k2-1];
		if(k1==1) {
			for(int i=1;i<k2;i++) {
				V2[i-1]=(byte)(inputB[i]-inputB[i-1]);
			}
			
		}
		if(k2==1) {
			for(int i=k1-1;i>0;i--) {
				V1[i-1]=(byte)(inputA[i]-inputA[i-1]);
			}
		}
		if(k2>1&&k1>1) {
			for(int i=k1-1;i>0;i--) {
				V1[i-1]=(byte)(inputA[i]-inputA[i-1]);
			}
			for(int i=0;i<k2-1;i++) {
				V2[i]=(byte)(inputB[i+1]-inputB[i]);
			}
		}
		findpath(k1-1,k2);
		
		String[] arr = string.split(" ");
		int min = Integer.parseInt(arr[0]);
		int l = arr.length;
		for(int i=1;i<l;i++) {
			int mid = Integer.parseInt(arr[i]);
			if(mid<min&&mid!=0) {
				min=mid;
			}
		}
		
		System.out.println(min);
		
	}
	
	public static void findpath(int l,int n) {
		if(tag==1) {
			return;
		}
		if(l>=M) {
			x=0;
			for(int i=k1-2;i>=l-M;i--) {
				x=(byte)(x+V1[i]);
			}
			string=string+x+" ";
			if(n-1!=0) {
				findpath(l-1, n);
			}
		}
		
		if(l<M){
			if(l==0&&n-1>=M) {
				y=0;
				for(int i=0;i<M;i++) {
					y=(byte)(y+V2[i]);
				}
				string=string+y+" ";
			}else if(l==0&&n-1<M) {
				tag=1;
			}else{
				x=0;
				y=0;
				for(int i=k1-2;i>=M-l-1;i--) {
					x=(byte)(x+V1[i]);
				}
				byte w=(byte)(2*x);
				for(int i=0;i<M-l;i++) {
					y=(byte)(y+V2[i]);
					w=(byte)(w+V2[i]);
				}
				y=(byte)(2*y);
				y=(byte)(y+x);
				string=string+w+" ";
				string=string+y+" ";
				findpath(l-1, n);
			}
			
		}
	}

}
