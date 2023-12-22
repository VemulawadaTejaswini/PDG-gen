    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n=Integer.parseInt(scan.next());
    		int m=Integer.parseInt(scan.next());
    		
    		int[] memo =new int[n];
    		Arrays.fill(memo, -1);
    		boolean ans =true;
    		int s,c;
    		for (int i=0;i<m;++i) {
    			s=Integer.parseInt(scan.next());
    			c=Integer.parseInt(scan.next());
    			
    			if (s==1 && c==0 && n!=1) {
    				ans=false;
    				break;
    			}else {
    				if (memo[s-1]==-1 || memo[s-1]==c) {
    					memo[s-1]=c;
    				}else {
    					ans=false;
    					break;
    				}
    				
    			}
    			
    		}
    		if (ans) {
    			if(memo[0]==-1&&n!=1) {
    				memo[0]=1;
    			}
    			for (int i:memo) {
    				if (i!=-1) {
    					System.out.print(i);
    				}else {
    					System.out.print(0);
    				}
    			}
    		}else {
    			System.out.print(-1);
    		}
    		
    		
    }	
    }
// end 