import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(count(0,n));
        
    }
    static int count(long num,long n) {
    	int ans=0;
    	
    	if(num<=n&&String.valueOf(num).contains("3")&&String.valueOf(num).contains("5")&&String.valueOf(num).contains("7")) {
    		ans++;
    		
    	}
    	if(num<=n) {
    		ans+=count(num*10+3,n)+count(num*10+5,n)+count(num*10+7,n);
    		
    	}
    	return ans;
    
    
    }
}
