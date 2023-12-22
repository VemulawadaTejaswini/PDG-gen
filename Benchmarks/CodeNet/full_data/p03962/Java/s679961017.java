import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num = 0;
		if(a==b&&b==c){
		    num = 2;
		}else{
    		if(a==b){
    		    num++;
    		}
    		if(a==c){
    		    num++;
    		}
    		if(b==c){
    		    num++;
    		}
		}
		
		int kind = 3-num;
		// 出力
		System.out.println(kind);
    }
}
