import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		int tmp=0;

		for(int i=0; i<N; i++){
			if((i+1)%2!=N%2){
				a.add(sc.nextInt());
			}else{
				a.add(0, sc.nextInt());
			}
		}
		String ans = "";
		for(int i=0; i<N; i++){
			ans += a.get(i)+" ";
		}
		System.out.println(ans);
    }
}
