import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String tmp = "";
        int cnt = 0;
        while(S.contains("01") || S.contains("10")) {
        	ArrayList<String> Stringlist = new ArrayList<String>(Arrays.asList(S.split("")));
        	for(int i = Stringlist.size();2 <= i;i--) {
        		String test = Stringlist.get(i-2) + Stringlist.get(i-1);
        		if("01".equals(test) ||"10".equals(test)) {
        			Stringlist.remove(i-1);
        			Stringlist.remove(i-2);
        			cnt++;
        			break;
        		}
        	}
        	S = String.join("", Stringlist);
        }
        System.out.println(cnt);
	}
}
