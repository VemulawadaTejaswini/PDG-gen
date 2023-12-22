

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		while(true) {
			if(!s.contains("erase")&&!s.contains("dream")||s.length()==0) {
				break;
			}
			
			if(s.contains("erase")) {
				if(s.indexOf("erase")==s.indexOf("eraser")) {
					s=s.replace("eraser", "");
				}else {
					s=s.replace("erase","");
				}
			}
			if(s.contains("dream")) {
				if(s.indexOf("dream")==s.indexOf("dreamer")) {
					s=s.replace("dreamer", "");
				}else {
					s=s.replace("dream","");
				}
			}
		}
		if(s.length()==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}