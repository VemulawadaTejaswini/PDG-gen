    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		
    		int[] ans= {a+b,a-b,a*b};
    		Arrays.parallelSort(ans);
    		System.out.print(ans[2]);
    		
    	


    		
     
    }
    }
// end 