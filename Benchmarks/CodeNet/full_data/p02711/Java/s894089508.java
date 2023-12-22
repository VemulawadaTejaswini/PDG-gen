import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String NN = N.toString();
		String ans = "No";
		if(NN.charAt(0) == '7'|| NN.charAt(1) == '7'|| NN.charAt(2) == '7'){
			ans = "Yes";
		}
	}
	System.out.println(ans);
}