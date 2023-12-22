import java.util.Scanner;

public class ABC109A {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {

		int A =Integer.parseInt(scn.next());
		int B =Integer.parseInt(scn.next());
		int X =0;
		for(int i =1;i<=3;i++){
			X=A*B*i;
			if(X%2==1)break;
		}
		if(X%2==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
