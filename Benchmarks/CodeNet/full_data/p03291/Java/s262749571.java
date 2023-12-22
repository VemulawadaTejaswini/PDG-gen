import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    static final int MOD = 1_000_000_007;
    public static long addMod(long a, long b){
    	long tmp = (a+b)%MOD;
    	return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long subMod(long a, long b){
    	return addMod(a,-b);
    }
    public static long multMod(long a, long b){
    	long tmp = (a*b)%MOD;
    	return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long powerMod(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) return (powerMod(a,x/2)*powerMod(a,x/2)) % MOD;
        return (a*powerMod(a,x-1)) % MOD;
    }
    public static long inverseMod(long a){
        return powerMod(a,MOD-2);
    }
    public static long divMod(long a, long b){
    	return multMod(a, inverseMod(b));
    }
    
    public static long solve(String S){
        int L = S.length();
        long[] Anum = new long[L];
        long[] ABnum = new long[L];
        long[] ABCnum = new long[L];
        Anum[0] = (S.charAt(0)=='A' || S.charAt(0)=='?') ? 1 : 0;
        ABnum[0]=0; ABCnum[0]=0;
        long strs = (S.charAt(0)=='?') ? 3 : 1;
        for(int l=1;l<L;l++){
        	char lth = S.charAt(l);
        	if(lth=='A'){
        	    Anum[l]  = addMod(Anum[l-1],strs);
        	    ABnum[l] = ABnum[l-1];
        	    ABCnum[l]= ABCnum[l-1];
        	}else if(lth=='B'){
        	    Anum[l]  = Anum[l-1];
        	    ABnum[l] = addMod(ABnum[l-1],Anum[l-1]);
        	    ABCnum[l]= ABCnum[l-1];
        	}else if(lth=='C'){
        	    Anum[l]  = Anum[l-1];
        	    ABnum[l] = ABnum[l-1];
        	    ABCnum[l]= addMod(ABCnum[l-1],ABnum[l-1]);
        	}else{
        	    Anum[l]  = addMod(multMod(3,Anum[l-1]),strs);
        	    ABnum[l] = addMod(multMod(3,ABnum[l-1]),Anum[l-1]);
        	    ABCnum[l]= addMod(multMod(3,ABCnum[l-1]),ABnum[l-1]);
        	    strs = multMod(strs,3);
        	}
        }
        return ABCnum[L-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }
}