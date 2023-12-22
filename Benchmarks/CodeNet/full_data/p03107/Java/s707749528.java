import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	sc.close();
    	int strt = S.length();
    	while(true){
    		S = S.replace("01", "");
    		S = S.replace("10", "");
    		if(S.length() == 0){
    			System.out.println(strt - S.length());
    			break;
    		}
    		for(int i = 0; i < S.length(); i++){
    			if(S.charAt(i) != '1'){
    				break;
    			}else if(i >= S.length()-1){
    				System.out.println(strt - S.length());
    				System.exit(0);
    			}
    		}
    		int num = Integer.parseInt(S);
    		if(num == 0){
    			System.out.println(strt - S.length());
				break;
    		}
    	}

    }
}