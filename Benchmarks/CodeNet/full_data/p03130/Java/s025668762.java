import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] count = new int[4];
		for(int i=0;i<3;i++){
			count[sc.nextInt()-1]++;
		}
		for(int n:count){
			if(n>=3){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}