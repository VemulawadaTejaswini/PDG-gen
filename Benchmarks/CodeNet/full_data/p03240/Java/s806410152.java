	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int[][] x = new int[N][3];
	        for (int i=0 ; i<N; i++) {
	            x[i][0] = Integer.parseInt(sc.next());
	            x[i][1] = Integer.parseInt(sc.next());
	            x[i][2] = Integer.parseInt(sc.next());
	        }
	        Arrays.sort(x, (b, c) -> Integer.compare(c[2], b[2]));
	        
	        for(int i=0;i<101;i++) {
	        	for(int j=0;j<101;j++) {
	        		long ans=x[0][2]+Math.abs(x[0][0]-i)+Math.abs(x[0][1]-j);
	        		boolean flg=true;
	        		for(int k=1;k<N;k++) {
	        			if(ans!=x[k][2]+Math.abs(x[k][0]-i)+Math.abs(x[k][1]-j)) {
	        				flg=false;
	        				break;
	        			}
	        		}
	        		if(flg==true) {
	        			System.out.print(i);
	        			System.out.print(" ");
	        			System.out.print(j);
	        			System.out.print(" ");
	        			System.out.println(ans);
	        			return;
	        		}
	        	}
	        }

	        

	        
	        

	    }
	    
	    

	}