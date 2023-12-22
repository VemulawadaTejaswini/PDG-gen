import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pre = 0;
		int now = 0;
		Boolean result = true;
		pre = sc.nextInt() - 1;
		for(int i = 1 ; i < n ; i++){
			now = sc.nextInt();
			if(now < pre){
				result = false;
				break;
			}else if(now == pre){
				pre = now;
			}else{
				pre = now-1;
			}
		}	

		if(result){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}