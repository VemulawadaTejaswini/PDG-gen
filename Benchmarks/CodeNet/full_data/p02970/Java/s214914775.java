import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int Remainder = 0;
		int ans=0;
		ans=(N/((2*D)+1));
		Remainder=(N%((2*D)+1));
		if(Remainder>=1){
		ans=ans+1;
		}
		System.out.println(ans);
    }
}