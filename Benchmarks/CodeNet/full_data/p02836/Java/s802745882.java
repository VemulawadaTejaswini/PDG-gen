import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
        // 文字列の入力
        int b = a.length();
        int c = b / 2;
        for(int i = 0;i < b / 2;i++){
            if(a.substring(i, i + 1).equals(a.substring(b - i - 1,b - i))){
                c--;
            }
        }
		System.out.println(c);
		
		
	}
}