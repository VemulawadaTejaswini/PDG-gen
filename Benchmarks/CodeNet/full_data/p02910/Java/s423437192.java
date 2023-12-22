import java.util.Scanner;

/**
 * @author yoshida3203
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		char[]a=S.toCharArray();

		int n=0;
		for(int i=0;i<S.length();i++){
			if(i%2==0){
				if(a[i]=='L'){
					n++;
				}
			}else{
				if(a[i]=='R'){
					n++;
				}
			}
		}
		if(n==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

