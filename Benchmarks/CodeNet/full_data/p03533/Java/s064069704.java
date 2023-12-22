import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.indexOf("AA") != -1){
			System.out.println(false);
		}
		
		s = s.replaceAll("A", "");
		
		if(s.equals("KIHBR")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		sc.close();
	}
	
}
