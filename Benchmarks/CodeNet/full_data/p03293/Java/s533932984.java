import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		String S=sc.nextLine();
		String T=sc.nextLine();
		char st[]=S.toCharArray();
		char a=0;
		for(int i=0;i<st.length;i++){
			if(S!=T){
				a=st[st.length-1];
				st[st.length]=st[0];
				st[0]=a;
				
			}else{
				System.out.println("yes");
				break;
			}
			
		}
		System.out.println("no");
	}

}
