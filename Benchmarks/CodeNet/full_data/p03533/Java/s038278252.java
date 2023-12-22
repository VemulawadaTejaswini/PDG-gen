import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		if(s.indexOf("AA") != -1 || s.indexOf("KIH") != -1){//連続するAが存在するなら作れない
			System.out.println("NO");
		}
		
		s = s.replaceAll("A", "");//Aはあとから好きなだけ追加できるので除去
		
		if(s.equals("KIHBR")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		sc.close();
	}
	
}
