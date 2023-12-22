import java.util.Scanner;

public class Main {
	
	static int [] inputA ;
	static int [] inputB ;
	static String string="";
    static int K;
    static int N;
    static int flag;

	
	public static void main(String args[]) throws Exception{
		
		flag=0;
		Scanner sc = new Scanner(System.in);
		
	    N = sc.nextInt();
	    K = sc.nextInt();
	    inputA = new int[N];
	    inputB = new int[N];
	    int k1=0;
	    int k2=0;
	    
	    for(int i=0;i<N;i++){
	    	int x = sc.nextInt();
	    	if(x<=0) {
	    		inputA[k1++]=x;
	    		
	    	}else {
	    		inputB[k2++]=x;
	    	}
	    }
	    
	    
	    if(k1>0) {
	    	for(int i=0;i<k1;i++) {
	    		inputA[i]=0-inputA[i];
	    	}
	    }
	    
	    findpath(k1,k2);
	    String [] arr =null;
	    arr=string.split(" ");
	    int min = Integer.parseInt(arr[0]);
	    int tag=0;
	    int x=0;
	    for(int i=1;i<arr.length;i++) {
	    	x=Integer.parseInt(arr[i]);
	    	if(min>x) {
	    		tag=min;
	    		min=x;
	    		x=tag;
	    	}
	    }
	    System.out.println(min);
	}
	
	
	public static void findpath(int l,int n) {
		if(flag==1) {
			return;
		}
		if(l>=K) {
			string=string+inputA[l-K]+" ";
			if(n!=0) {
				findpath(l-1,n);
			}
		}
		if(l<K) {
			if(l==0&&n>=K) {
				string=string+inputB[K-1]+" ";
			}else if(l==0&&n<K){
				flag=1;
			} else if(l>0&&K-l<=n) {
					int chg1 = 0;
					int chg2 = 0;
					chg1 = inputA[N-l-n];
					chg2 = inputB[K-l-1];
			        if(chg1>=chg2) {
			        	string = string+(chg1+2*chg2)+" ";
			        }else {
			        	string = string+ (chg2+2*chg1)+" ";
			        }
					findpath(l-1,n);
			}
		}
	
	}

}
