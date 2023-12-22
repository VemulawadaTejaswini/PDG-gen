import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
	    int N = scan.nextInt();
	    String S = scan.next();
	    char[] c = S.toCharArray();
	    
	    for(int i=0; i<S.length(); i++){
	      c[i]= (char)((c[i]-'A'+N)%26+'A');
	    }
	    String str = "";
	    System.out.println(str.valueOf(c));
	}

}
