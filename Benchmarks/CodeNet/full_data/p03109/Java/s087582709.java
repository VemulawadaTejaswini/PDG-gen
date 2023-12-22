import java.util.Scanner;

/**
 * Class Untitled
 */
public class Main {
	public static void main(String[] args) {
		//入力用インスタンスの作成
    	Scanner scan = new Scanner(System.in);
    	//入力する。
    	String str = scan.next();
    	//分割しれ配列に格納する。
    	String[] gengou = str.split("/", 0);
    	
    		
		int i = Integer.parseInt(gengou[0]);
    	if(i <= 2019){
    		i = Integer.parseInt(gengou[1]);
    		if(i <= 4){
    			System.out.println("Heisei");
    		}else{
    			System.out.println("TBD");
    		}
    		
    	}else{
    		System.out.println("Heisei");
    	}
	}
}