import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	//初期化読み込み
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	boolean flag_C = false;
    	boolean flag_F = false;
    	int cn = 0;
    	for(char c:  s.toCharArray()) {
    		cn++;
    		if(cn>100) break;
    		if(!flag_C ) {
    			if(c == 'C') {
    				flag_C = true;
    			}
    		}else if(flag_C && !flag_F){
    			if(c == 'F') {
    				flag_F = true;
    				break;
    			}
    		}
    	}
    	System.out.println(flag_F?"Yes":"No");
	}
}