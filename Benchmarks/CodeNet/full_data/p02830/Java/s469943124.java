import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        String S = sc.next();
        String T = sc.next();
        
        char[] A = new char[100];
        char[] B = new char[100];
        String ans = new String("");

        for(int i=0;i<N;i++) {
        	ans= ans + S.substring(i,i+1);
        	ans= ans + T.substring(i,i+1);
        }
        System.out.println(ans);	
        
        
    }
}