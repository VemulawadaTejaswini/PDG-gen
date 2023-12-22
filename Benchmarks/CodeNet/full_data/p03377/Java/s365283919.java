    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int x = sc.nextInt();
    		// 出力
    		if(a <= x && x <= (a + b)){
    		    System.out.println("YES");
    		}else{
    		    System.out.println("NO");
    		}
    	}
    }
