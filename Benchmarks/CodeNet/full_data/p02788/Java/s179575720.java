import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long D = sc.nextLong();
        long A = sc.nextLong();
        long[][] XH = new long[N][3];
        
        long cnt=0;
        for(int i=0;i<N;i++) {
        	XH[i][0]=sc.nextLong();
        	XH[i][1]=sc.nextLong();
        }
        
        Arrays.sort(XH, (b, c) -> Long.compare(b[0], c[0]));
        
        long damege=0;
        long s[]=new long[N];
		LinkedList<Long> queue = new LinkedList<Long>();
		long sum=0;
		long nextX=0;
		long d=0;
    	for(int i=0;i<N;i++) {
			while(!queue.isEmpty()&&XH[i][0]>2*D+queue.element()) {
				nextX=queue.poll();
				d=queue.poll();
    			sum=sum-d;
			}
			XH[i][1]=XH[i][1]-sum;
    		if(XH[i][1]>0) {
				if(XH[i][1]%A==0) {
					damege=XH[i][1];
				}else {
					damege=(XH[i][1]/A)*A+A;
				}
    			sum=sum+damege;
    			queue.add(XH[i][0]);
    			queue.add(damege);
				cnt=cnt+damege/A;
    		}
    	}
        
        System.out.println(cnt);        	
                		
    }
    
    
}