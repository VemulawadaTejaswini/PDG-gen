import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new B().doIt();
	}
	class B{
		void doIt(){
			String str = sc.next();
			int length = str.length();
			char ctr[] = str.toCharArray();
			int cnt = 0;
			for(int i = 0;i < length;i++){
				if(i % 2 == 0){
					if(ctr[i] == 'p')cnt--;
				}else{
					if(ctr[i] == 'g')cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
