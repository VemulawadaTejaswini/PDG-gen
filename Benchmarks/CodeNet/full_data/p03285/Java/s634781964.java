import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 0;
		for(int i=0; i<15; i++){
			if(n<0){
				break;
			}
			else if(n%4==0){
				ans = 1;
				break;
			}
			n = n-7;
		}

		if(ans==0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}