import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		while(true) {
			if(!s.contains("erase")&&!s.contains("dream")||s.length()==0) {
				break;
			}
			
			s=s.replace("eraser", "").replace("dreamer","").replace("erase","").replace("dream","");
			
		}
		if(s.length()==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}