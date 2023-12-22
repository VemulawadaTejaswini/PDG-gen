import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			StringBuilder Sa = new StringBuilder(br.readLine());
			StringBuilder Sb = new StringBuilder(br.readLine());
			StringBuilder Sc = new StringBuilder(br.readLine());

			//aのターン

			a(Sa,Sb,Sc);




			System.out.println();
		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}

	static void a(StringBuilder Sa, StringBuilder Sb, StringBuilder Sc){

		if(Sa.length() == 0){
			System.out.println("A");
			return;
		}

		String SaHead = Sa.substring(0, 1);
		Sa.deleteCharAt(0);

		if(SaHead.equals("a")){
			a(Sa,Sb,Sc);
		}else if(SaHead.equals("b")){

			b(Sa,Sb,Sc);
		}else{

			c(Sa,Sb,Sc);
		}

	}

	static void b(StringBuilder Sa, StringBuilder Sb, StringBuilder Sc){

		if(Sb.length() == 0){
			System.out.println("B");
			return;
		}

		String SaHead = Sb.substring(0, 1);
		Sb.deleteCharAt(0);

		if(SaHead.equals("a")){
			a(Sa,Sb,Sc);
		}else if(SaHead.equals("b")){

			b(Sa,Sb,Sc);
		}else{

			c(Sa,Sb,Sc);
		}
	}

	static void c(StringBuilder Sa, StringBuilder Sb, StringBuilder Sc){

		if(Sc.length() == 0){
			System.out.println("C");
			return;
		}

		String SaHead = Sc.substring(0, 1);
		Sc.deleteCharAt(0);

		if(SaHead.equals("a")){
			a(Sa,Sb,Sc);
		}else if(SaHead.equals("b")){

			b(Sa,Sb,Sc);
		}else{

			c(Sa,Sb,Sc);
		}
	}
}
