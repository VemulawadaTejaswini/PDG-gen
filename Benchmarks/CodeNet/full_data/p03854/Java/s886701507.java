import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		s.append(sc.next());
		String str=s.reverse().toString();
		str=str.replaceAll("maerd","");
		str=str.replaceAll("remaerd","");
		str=str.replaceAll("resare","");
		str=str.replaceAll("esare","");
		
		if(str.equals(""))System.out.println("YES");
		else System.out.println("NO");
	}

}
