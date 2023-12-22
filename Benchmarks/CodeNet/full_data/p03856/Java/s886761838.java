import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		StringBuffer S = new StringBuffer(sc.next());
		while(S.length() > 0) {
			if(S.lastIndexOf("dream") == S.length() - 5 || S.lastIndexOf("erase") == S.length() - 5) {
				S = S.delete(S.length() - 5, S.length());
			}else if(S.lastIndexOf("dreamer") == S.length() - 7) {
				S = S.delete(S.length() - 7, S.length());
			}else if(S.lastIndexOf("eraser") == S.length() - 6) {
				S = S.delete(S.length() - 6, S.length());
			}else {
				break;
			}
		}
		System.out.println(S.length() == 0 ? "YES" : "NO");
	}
}