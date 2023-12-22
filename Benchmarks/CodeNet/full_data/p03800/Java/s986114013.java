	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        boolean flg = false;
	        int[] a= new int[N+5];
	        for(int i=0;i<4;i++) {
		        a = new int[N+5];
	        	a[0]=i%2;
	        	a[1]=i>>1;
	        	for(int j=1;j<N+1;j++) {
	        		if(a[j]==0) {
	        			if(c[j%N]=='o') {
	        				a[j+1]=a[j-1];
	        			} else {
	        				a[j+1]=(a[j-1]+1)%2;
	        			}
	        		} else {
	        			if(c[j%N]=='o') {
	        				a[j+1]=(a[j-1]+1)%2;
	        			} else {
	        				a[j+1]=a[j-1];
	        			}	        			
	        		}
	        	}
	        	if(a[0]==a[N]&&a[1]==a[N+1]) {
	        		flg=true;
	        		break;
	        	}
	        }
	        
	        if(flg==false) {
	        	System.out.println(-1);
	        	return;
	        }
	        
	        StringBuffer str = new StringBuffer();
	        for(int i=0;i<N;i++) {
	        	if(a[i]==0) {
	        		str.append("S");
	        	} else {
	        		str.append("W");
	        	}
	        }
	        System.out.println(str);
		 }
	}