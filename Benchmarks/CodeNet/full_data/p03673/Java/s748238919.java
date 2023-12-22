import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans = "";

		for(int i=0; i<N; i++){
			if((i+1)%2!=N%2){
				ans += String.valueOf(sc.nextInt()) + " ";
			}else{
				ans = String.valueOf(sc.nextInt()) + " " + ans;
			}
		}
		System.out.println(ans.substring(0, ans.length()-1));
    }
}
