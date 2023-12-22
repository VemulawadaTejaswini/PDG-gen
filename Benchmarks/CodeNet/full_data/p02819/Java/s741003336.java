import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans=0;
        for(int i =X;i<2*X+2;i++) {
    		boolean flg=true;
        	for(int j=2;j<X;j++) {
        		if(i%j==0) {
        			flg=false;
        			break;
        		}
        	}
        	if(flg==true) {
        		ans=i;
        		break;
        	}
        }

        System.out.println(ans);
        		
    }
}