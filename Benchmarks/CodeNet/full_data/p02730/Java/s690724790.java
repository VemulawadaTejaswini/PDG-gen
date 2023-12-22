import java.util.*;
import java.util.*;

public class Main {
	static String REV(String A) {
		//String src = "HELLO";
		StringBuffer sb = new StringBuffer(A);
		String REV_S = sb.reverse().toString();
		//System.out.println(""+REV_S);
        return REV_S;
	}


    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.nextLine();
        int N = S.length();
        String RE_1 = REV(S);
        int flg =0;

        for(int i=0; i<N; i++){
            if(S.charAt(i) != RE_1.charAt(i)) flg = 1;
        }

        String S2 = S.substring(0, (N-1)/2);
        //System.out.println(S2);
        String RE_2 = REV(S2);
        for(int i=0; i<S2.length(); i++){
            if(S.charAt(i) != RE_1.charAt(i)) flg = 2;
        }

        String S3 = S.substring((N-1+3)/2, N);
        //System.out.println("S3: "+S3);

        String RE_3 = REV(S2);
        for(int i=0; i<S3.length(); i++){
            if(S.charAt(i) != RE_1.charAt(i)) flg = 3;
        }
        




        if(flg != 0){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }

    }
}