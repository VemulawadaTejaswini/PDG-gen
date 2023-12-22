import java.util.Scanner;

public class Main {
	
	static int [] inputA ;
	static int [] inputB ;
    static int K;
    static int N;
    static int flag;
    static int min;

	
	public static void main(String args[]) throws Exception{
		min=0;
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
	    
	    if(k1>0&&k2>0) {
	    	 if(inputA[0]>inputB[k2-1]) {
	 	    	min=2*inputA[0]+inputB[k2-1];
	 	    }else {
	 	    	min=inputA[0]+2*inputB[k2-1];
	 	    	System.out.println(min);
	 	    }
	    }
	    if(k1==0&&k2>0) {
	    	min=inputB[k2-1];
	    }
	    if(k2==0&&k1>0) {
	    	min=inputA[0];
	    }
	   
	    
	    
	    findpath(k1,k2);
	    System.out.println(min);
	}
	
	
	public static void findpath(int l,int n) {
		if(flag==1) {
			return;
		}
		if(l>=K) {
			if(inputA[l-K]<min) {
				min=inputA[l-K];
			}
			if(n!=0) {
				findpath(l-1,n);
			}
		}
		if(l<K) {
			if(l==0&&n>=K) {
				if(inputB[K-1]<min) {
					min=inputB[K-1];
				}
			}else if(l==0&&n<K){
				flag=1;
			} else if(l>0&&K-l<=n) {
					int chg1 = 0;
					int chg2 = 0;
					chg1 = inputA[N-l-n];
					chg2 = inputB[K-l-1];
			        if(chg1>=chg2) {
			        	if(min>2*inputB[K-l-1]+inputA[N-l-n]) {
			        		min=2*inputB[K-l-1]+inputA[N-l-n];
			        	}
			        }else {
			        	if(min>inputB[K-l-1]+2*inputA[N-l-n]) {
			        		min=inputB[K-l-1]+2*inputA[N-l-n];
			        	}
			        }
					findpath(l-1,n);
			}
		}
	
	}

}
