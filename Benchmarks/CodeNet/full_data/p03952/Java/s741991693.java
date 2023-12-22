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
    	if(2*n-1>x&&x>2){
    		System.out.println("Yes");
    		int[] blocks = new int[2*n-1];
    		blocks[n-2] = x-2;
    		blocks[n-1] = x;
    		blocks[n] = x+1;
    		blocks[n+1] = x-1;
    		int j = 1;
    		for(int i=0;i<blocks.length;i++){
    			if(i==n-2){
    				i+=3;
    				continue;
    			}
    			blocks[i] = j++;
    			if(j==x-2){
    				j+=4;
    			}
    		}
    		
    		for(int b:blocks){
    			System.out.println(b);
    		}
    	}else{
    		System.out.println("No");
    	}
    }
    
    
}