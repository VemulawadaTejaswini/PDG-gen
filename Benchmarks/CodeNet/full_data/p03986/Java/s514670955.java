import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str1 = new String();
		String str2 = new String();
		//System.out.println(s.indexOf("ST", 0));
		while(s.contains("ST")){
			//char[] ch = s.toCharArray();
			int pos = s.indexOf("ST", 0);
			str1=s.substring(0,pos);
			str2=s.substring(pos+2, s.length());
			s = str1+str2;
		}
		System.out.println(s.length());
	}

}