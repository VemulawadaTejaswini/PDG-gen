	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        if(N==3) {
        		System.out.println(2);
        		System.out.println("1 3");
        		System.out.println("2 3");	        	
	        } else if(N==3) {
        		System.out.println(4);
        		System.out.println("1 2");
        		System.out.println("1 3");
        		System.out.println("2 4");	        	
        		System.out.println("3 4");	        	
	        } else if(N%2==0) {
        		System.out.println(2*N);
	        	for(int i=1;i<N/2;i++) {
	        		int k=(i+1);
	        		System.out.println(i + " " + k);
	        		System.out.println(i + " " + (N-k+1));
	        		System.out.println((N-i+1) + " " + k);
	        		System.out.println((N-i+1) + " " + (N-k+1));
	        	}
        		System.out.println(N/2 + " " + 1);
        		System.out.println(N/2 + " " + + N);
        		System.out.println(N/2+1 + " " + 1);
        		System.out.println(N/2+1 + " " + N);
	        	
	        } else {
        		System.out.println(2*N);
	        	for(int i=1;i<N/2;i++) {
	        		int k=(i+1);
	        		System.out.println(i + " " + k);
	        		System.out.println(i + " " + (N-k));
	        		System.out.println((N-i) + " " + k);
	        		System.out.println((N-i) + " " + (N-k));
	        	}
        		System.out.println(N/2 + " " + N);
        		System.out.println(N/2+1 + " " + N);
        		System.out.println(1 + " " + N);
        		System.out.println(1 + " " + N);
        		System.out.println(N-1 + " " + N);
        		System.out.println(N-1 + " " + N);
	        }
	        
	    }
	}