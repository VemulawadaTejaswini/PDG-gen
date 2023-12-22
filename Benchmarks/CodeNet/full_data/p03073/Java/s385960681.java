import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Math.min(count(s,'1'),count(s,'0')));
        sc.close();
    }
    static int count(String s,char c){
        char pre = c;
        int cnt = 0;
        if(pre != s.charAt(0)) ++cnt;
        for(int i = 1; i<s.length(); i++){
            //System.out.println(pre);
            if(s.charAt(i) == pre) cnt++;
            if(pre == '1') pre = '0';
            else pre = '1';
        }
        return cnt;
    }
}