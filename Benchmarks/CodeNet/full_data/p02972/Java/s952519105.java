import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[200001];

		for(int i = 1 ; i <= n ; i++){
			a[i] = sc.nextInt();
		}

		int ball = 0;
		int box = 0;
		int[] boxnum = new int[200001];
		for(int i = n ; i > 0 ; i--){
			ball = 0;
			for(int j = ((int)(n/i))*i ; j > i ; j -= i){
				ball += a[j];
			}
			ball %= 2;
			if(ball == a[i]){
				a[i] = 0;
			}else{
				a[i] = 1;
				boxnum[box] = i;
				box++;
			}
		}

		System.out.println(box);
		for(int i = 0 ; i < box ; i++){
			System.out.printf("" + boxnum[i] + " ");
		}
	}

}