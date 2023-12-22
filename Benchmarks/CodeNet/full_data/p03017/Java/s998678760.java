import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean flag = true;

		// 文字列の入力
		String s = sc.next();
        sc.close();
        if(c < d){
            for (int i = 0;i < n-1; i++){
                if(s.charAt(i)=='#'&& s.charAt(i+1)=='#'){
                    flag = false;
                    break;
                }
            }

        } else{
            flag = false;
            for (int i = 0;i < n-2; i++){
                if((s.charAt(i)=='#')&& (s.charAt(i+1)=='#')){
                    flag = false;
                    break;
                }
                if((s.charAt(i)=='.')&& (s.charAt(i+1)=='.') && (s.charAt(i+2)=='.')){
                    flag = true;
                }
            }
        }


        if(flag){
            System.out.println("Yes");
        } else{
            System.out.println("No");

        }
	}
}
