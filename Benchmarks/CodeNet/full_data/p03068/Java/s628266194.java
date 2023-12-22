//package first_beginner;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		int len = in.nextInt() ;
		String line = in.next() ;
		int index = in.nextInt() ;
		char flag = line.charAt(index-1) ;
		for(int i=0;i<len;i++) {
			if(line.charAt(i)!=flag) {
				System.out.print("*");
			}else {
				System.out.print(flag);
			}
		}
	}

}
