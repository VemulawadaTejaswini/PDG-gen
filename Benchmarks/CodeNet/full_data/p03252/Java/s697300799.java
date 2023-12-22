import java.util.*;
import java.io.*;

public class Main {
    public static boolean solve(String S, String T){
        int N = S.length();
        Map<Character,Character> StoT = new HashMap<>();
        Map<Character,Character> TtoS = new HashMap<>();
        for(int n=0;n<N;n++){
        	char s = S.charAt(n);
        	char t = T.charAt(n);
        	if(StoT.get(s)==null){
        	    StoT.put(s,t);
        	}else if(StoT.get(s)!=t){
        	    //System.out.println(s+"->"+StoT.get(s)+"?"+t);
        	    return false;
        	}
        	if(TtoS.get(t)==null){
        	    TtoS.put(t,s);
        	}else if(TtoS.get(t)!=s){
                //System.out.println(t+"->"+TtoS.get(t)+"?"+s);
        	    return false;
        	}
        }
        
        //System.out.println(StoT);
        return true;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        System.out.println(solve(S,T) ? "Yes" : "No");
         
    }
}
