import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rst;
		s=s.replaceAll("eraser","");
		s=s.replaceAll("erase","");
		s=s.replaceAll("dreamer","");
		s=s.replaceAll("dream", "");
		
			
		
		if(s.length()==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}