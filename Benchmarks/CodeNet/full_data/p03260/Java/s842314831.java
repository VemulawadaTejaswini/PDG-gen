import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = 0;
        for(int c=1;c<=3;c++){
            if((a*b*c)%2 == 1) flag = 1;
        }
        if(flag == 0)System.out.print("NO");
        else System.out.print("YES");
	}
}