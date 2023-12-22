import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
        	int n = cin.nextInt();
        	int x = cin.nextInt();
            getSub(n,x);
        }
    }
    public static void getSub(int n,int x){
    	if(n==2){
    		System.out.println(x==2?"Yes\n1\n2\n3":"No");
    		return;
    	}
    	if(2*n-1>x&&x>1){
    		System.out.println("Yes");
    		int j = 1;
    		for(int i=0;i<2*n-1;i++){
    			if(i==n-2){
    				i+=3;
    				if(x == 2*n-2){
    					System.out.println(x-2);
        				System.out.println(x);
        				System.out.println(x+1);
        				System.out.println(x-1);
    				}else{
    					System.out.println(x+1);
        				System.out.println(x-1);
        				System.out.println(x);
        				System.out.println(x+2);
    				}
    				continue;
    			}
    			System.out.println(j++);
    			if(j==(x == 2*n-2?x-2:x-1)){
    				j+=4;
    			}
    		}
    	}else{
    		System.out.println("No");
    	}
    }   
}