import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        
        if(!(a>=1 && a<=12)) {
        	cnt = 0;
        }else {
        	if(!(b>=1 && b<=31)) {
        		cnt=0;
        	}else {
        		for(int i=1;i<a;i++) {
        			cnt++;
        			if(!(b-i>=0)) {
        				break;
        			}
        		}System.out.println(cnt);
        	}
        }
    }
}