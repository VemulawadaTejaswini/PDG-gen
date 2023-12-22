import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		/*
		 * 連続するAが存在する
		 * KIHの間にA(やその他の文字)が入っている
		 * ならば作れない
		 */
		if(s.indexOf("AA") != -1 || s.indexOf("KIH") == -1){
			System.out.println("NO");
		}
		
		s = s.replaceAll("A" , "");//Aはあとから好きなだけ追加できるので
	
		
		if(s.equals("KIHBR")){//残るのがこれだけならば作れる
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		sc.close();
	}
	
}
