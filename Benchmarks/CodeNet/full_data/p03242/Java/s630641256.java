import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String st=sc.next();
		char n[]=st.toCharArray();

		for(int i=0;i<st.length();++i){
			if(n[i]=='9') n[i]='1';
			if(n[i]=='1') n[i]='9';
		}
		System.out.println(n[0]+n[1]+n[2]);
	}
}
