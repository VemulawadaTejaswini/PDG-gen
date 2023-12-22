import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] a = new int[N];
	        int[] b = new int[N];
	        int et=0;
	        int ot=0;
	        for (int i=0 ; i<N; i++) {
	        	if(i%2==0) {
		            a[i] = Integer.parseInt(sc.next());
		            et++;
	        	} else {
		            b[i] = Integer.parseInt(sc.next());
		            ot++;
	        	}
	        }
	        Arrays.sort(a);
	        Arrays.sort(b);
	        int[][] ec = new int[N][2];
	        int[][] oc = new int[N][2];
	        int tmp=0;
	        int k=0;
	        for(int i=N-1;a[i]!=0;i--) {
	        	if(tmp!=a[i]) {
	        		ec[k][0]++;
	        		ec[k][1]=a[i];
	        		tmp=a[i];
	        		k++;	
	        	} else {
	        		ec[k-1][0]++;
	        	}
	        }
	        
	        tmp=0;
	        k=0;
	        for(int i=N-1;b[i]!=0;i--) {
	        	if(tmp!=b[i]) {
	        		oc[k][0]++;
	        		oc[k][1]=b[i];
	        		tmp=b[i];
	        		k++;	
	        	} else {
	        		oc[k-1][0]++;
	        	}
	        }
	        long ans=0;
	        Arrays.sort(oc, (d, c) -> Integer.compare(c[0], d[0]));
	        Arrays.sort(ec, (d, c) -> Integer.compare(c[0], d[0]));
	        if(oc[0][1]==ec[0][1]) {
	        	int t=N-oc[0][0]-ec[1][0];
	        	int s=N-oc[1][0]-ec[0][0];
	        	ans=Math.max(t, s);
	        } else {
	        	ans=N-oc[0][0]-ec[0][0];
	        }
	        
	        System.out.println(ans);
  	        	        
	 }

}