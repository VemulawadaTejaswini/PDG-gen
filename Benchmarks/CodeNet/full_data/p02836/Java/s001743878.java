import java.util.*;

class Main {
    static String REV(String A) {
		//String src = "HELLO";
		StringBuffer sb = new StringBuffer(A);
		String REV_S = sb.reverse().toString();
		//System.out.println(""+REV_S);
        return REV_S;
    }

    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        String S_REV = REV(S);
        int S_N = S.length();

        int cnt = 0;
        for(int i = 0; i<S_N/2; i++){
            if(S.charAt(i) != S_REV.charAt(i)) cnt++;
        }
        System.out.print(cnt);




    }
}

