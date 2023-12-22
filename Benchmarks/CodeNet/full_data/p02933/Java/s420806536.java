import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		String s=st.next();
		if(a>=3200)
			System.out.println(s);
		else {
			s="red";
			System.out.println(s);
		}
	}

}
