import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("input.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int ans = 0;
    	if(N < 357){
    		System.out.println(ans);
    		System.exit(0);
    	}
    	boolean flg_3 = false;
    	boolean flg_5 = false;
    	boolean flg_7 = false;
    	for(int i = 357; i <= N; i += 2){
    		char[] ary = String.valueOf(i).toCharArray();
    		for(char c : ary){
    				if(c == '7'){
        				flg_7 = true;
        			}else if(c == '5'){
        				flg_5 = true;
        			}else if(c == '3'){
        				flg_3 = true;
        			}else{
        				flg_3 =false;
        				break;
        			}
    		}
    		if(flg_3 && flg_5 && flg_7){
    			ans++;
    		}
    		flg_3 = false;
    		flg_5 = false;
    		flg_7 = false;
    	}
    	System.out.println(ans);
    }
}