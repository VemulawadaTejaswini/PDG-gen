import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		boolean judge = true;
		if(s.contains("a")){s = s.replace("a", "");}else{judge = false;}
		if(s.contains("b")){s = s.replace("b", "");}else{judge = false;}
		if(s.contains("c")){judge = false;}
		System.out.println(judge ? "YES" : "NO");
	}
}
