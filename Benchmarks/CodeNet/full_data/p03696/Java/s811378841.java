import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int A = cin.nextInt();
		String text = cin.next();
		int left=0;
		int right=0;
		for(int i=0;i<A;i++){
			if(text.charAt(i)=='('){
				left++;
			}else{
				right++;
			}
		}
		if(left==right){
		}else if(left<right){
			for(int j=0;j<right-left;j++){
				System.out.print("(");
			}
		}
		System.out.print(text);
		if(left>right){
			for(int k=0;k<left-right;k++){
				System.out.print(")");
			}
		}
		System.out.println();
	}
}
