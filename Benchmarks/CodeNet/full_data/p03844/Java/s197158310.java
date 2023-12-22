import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int A=reader.nextInt();
		String op=reader.next();
		int  B=reader.nextInt();
		if(op.equals ("+")){
			System.out.print(A+B);
		}
		else {
			System.out.print(A-B);

		}
		}
}
