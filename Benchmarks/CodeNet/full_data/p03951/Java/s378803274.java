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
    	int l1=s1.length(),l2=s2.length();
    	int l = l1<l2?l1:l2;
    	int lm = l1+l2-l;
    	for(int i=n>lm?n-lm:0;i<l;i++){
    		if(s1.substring(l1-i-1).equals(s2.substring(0,i+1))){
    			return l1+l2-i-1;
    		}
    	}
    	return l1+l2;
    }
    
}