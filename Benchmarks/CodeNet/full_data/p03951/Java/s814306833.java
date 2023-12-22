import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
        	int n = cin.nextInt();
        	String s1 = cin.next();
            String s2 = cin.next();
            System.out.println(getSub(s1,s2,n));
        }
    }
    public static int getSub(String s1,String s2,int n){
    	for(int i=0;i<n;i++){
    		if(s1.substring(n-i-1).equals(s2.substring(0,i+1))){
    			return n*2-i-1;
    		}
    	}
    	return n*2;
    }
    
}