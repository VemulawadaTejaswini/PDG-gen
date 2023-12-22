import java.util.Scanner;
public class Main{
	static int M;
	static byte [] inputA;
	static byte [] inputB;
	static int k1;
	static String string="";
	static int tag=0;
	
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		M = sc.nextInt();
		inputA = new byte [N+1];
		inputB = new byte [N+1];
		k1=0;
		int k2=0;
		for(int i=0;i<N;i++) {
			byte t = sc.nextByte();
			if(t<=0) {
				inputA[k1++]=t;
			}else{
				inputB[k2++]=t;
			}
		}
	
		sc.close();
		if(k1>=1) {
			for(int i=k1-1;i>=0;i--) {
				inputA[i]=(byte)(0-inputA[i]);
			}
		}
		findpath(k1,k2);
		
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
			string=string+inputA[l-M]+" ";
			if(n!=0) {
				findpath(l-1, n);
			}
		}
		if(l<M){
			if(l==0&&n>=M) {
				string=string+inputB[M-1]+" ";
			}else if(l==0&&n<M) {
				tag=1;
			}else{
				if(l+n<M) {
					tag=1;
				}else{
					byte x=0;
					byte y=0;
					x=inputA[k1-l];
					byte w=(byte)(2*x);
					y=inputB[M-l-1];
					w=(byte)(w+y);
					y=(byte)(2*y);
					y=(byte)(y+x);
					string=string+w+" ";
					string=string+y+" ";
					findpath(l-1, n);
				}
					
				}
					
				}
	}

}
