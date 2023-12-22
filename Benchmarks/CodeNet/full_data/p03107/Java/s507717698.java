import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int zerocnt = 0;
        int onecnt = 0;
        int test = 0;
    	ArrayList<String> Stringlist = new ArrayList<String>(Arrays.asList(S.split("")));
    	for(String i : Stringlist) {
    		if("0".equals(i)) {
    			zerocnt++;
    		}else {
    			onecnt++;
    		}
    	}
        System.out.println(Math.min(zerocnt, onecnt) * 2);
	}
}
