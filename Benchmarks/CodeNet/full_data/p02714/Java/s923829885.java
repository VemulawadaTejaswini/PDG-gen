import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Match{
    public static int simple(String str, char target){
	    int count = 0;
	    for(char x: str.toCharArray()){
		    if(x == target){
			count++;
		    }
	    }
	    return count;
    }
}

class Main{
    public static void main(String args[]){
        String buf;
        int num;
        int ans = 0;
        int r_num = 0;
        int g_num = 0;
        int b_num = 0;
        char r = 'R';
        char g = 'G';
        char b = 'B';

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 0から始まることを考慮
            num = Integer.parseInt( br.readLine() )-1;
            buf = br.readLine();
            r_num = Match.simple( buf , r );
            g_num = Match.simple( buf , g );
            b_num = Match.simple( buf , b );
            ans = r_num * g_num * b_num;

            // 0から始まることを考慮
            for(int i = 0; i <= num - 2 ; i++ ){
                for(int k = num - ( num - i ) % 2 ; k > i + 1 ; k -= 2 ){
                    int j = ( k + i ) / 2;
                    String tmp;
                    tmp = String.valueOf( buf.charAt(i) ) + String.valueOf( buf.charAt(j) ) + String.valueOf( buf.charAt(k) );
                    if ( tmp.contains("R") == true && tmp.contains("G") == true && tmp.contains("B") == true ){
                        ans -= 1;
                    }
                }
            }         
        } catch(Exception e) {
        }
        System.out.println(Integer.toString(ans));
    }
}
